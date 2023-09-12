package tdd.BankAccountTestApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.BankAccountApp.Bank;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    Bank bank  ;
    @BeforeEach
    void setUp(){
        bank = new Bank();
        bank.register("ola","ola","0000");
    }

    @Test
    public void assertBankIsNotNull(){
        System.out.println(bank);
        assertNotNull(bank);
    }

    @Test
    public void bankCanRegisterCustomersTest(){
        bank.register("mo","yin","0");
        bank.register("moy","in","0");
        assertEquals(3, bank.getNoOfCustomer());
    }

    @Test
    public void testThatBankCanDepositIntoAGivenAccount(){
        bank.register("mo","yin","0");
        bank.deposit(BigDecimal.valueOf(2000.00),"1");
        assertEquals(BigDecimal.valueOf(2000.00), bank.checkBalance("1", "0000"));
    }
    @Test
    public void testThatBankCanNotDepositNegativeAmountIntoAGivenAccount() {
        assertThrows(IllegalArgumentException.class, () -> bank.deposit(BigDecimal.valueOf(-4000.0), "1"));
        assertEquals(BigDecimal.ZERO,bank.checkBalance("1","0000"));
    }

    @Test
    public void testThatBankCanTransferIntoAnotherAccount(){
        bank.register("tolu","mide","0000");
        assertEquals(2,bank.getNoOfCustomer());
        bank.deposit(BigDecimal.valueOf(16000),"1");
        assertEquals(BigDecimal.valueOf(16000), bank.checkBalance("1","0000"));
        bank.transfer("1","0000","2",BigDecimal.valueOf(10000));
        assertEquals(BigDecimal.valueOf(6000),bank.checkBalance("1","0000"));
    }

    @Test
    public void testThatBankCanWithdrawFromAccount(){
        bank.register("tolu","mide","0000");
        bank.deposit(BigDecimal.valueOf(5000.00),"2");
        bank.withdraw(BigDecimal.valueOf(2000.00),"0000","2");
        assertEquals(BigDecimal.valueOf(3000.00), bank.checkBalance("2","0000"));
    }

    @Test
    public void checkBalanceTest(){
        bank.register("ola","mide","0000");
        assertEquals(BigDecimal.ZERO,bank.checkBalance("1","0000"));
        bank.deposit(BigDecimal.valueOf(3000.00),"1");
        assertEquals(BigDecimal.valueOf(3000.0), bank.checkBalance("1","0000"));
    }

}
