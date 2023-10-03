package bankAccountTestApp;
import exceptions.InsufficientFundException;
import exceptions.invalidCredentialsException;
import exceptions.negativeAmountCanNotBeDeposited;
import exceptions.wrongPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ServerClasses.bankAccountApp.Bank;

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
        assertEquals(1, bank.getNoOfCustomer());
    }

    @Test
    public void testThatBankCanDepositIntoAGivenAccount() throws invalidCredentialsException, wrongPinException, negativeAmountCanNotBeDeposited {
        bank.deposit(BigDecimal.valueOf(2000.00),"1");
        BigDecimal newBalance = bank.checkBalance("1", "0000");
        assertEquals(BigDecimal.valueOf(2000.00),newBalance);
    }
    @Test
    public void testThatBankCanNotDepositNegativeAmountIntoAGivenAccount() throws wrongPinException {
        assertThrows(IllegalArgumentException.class, () -> bank.deposit(BigDecimal.valueOf(-4000.0), "1"));
        assertEquals(BigDecimal.ZERO,bank.checkBalance("1","0000"));
    }

    @Test
    public void testThatBankCanTransferIntoAnotherAccount() throws invalidCredentialsException, wrongPinException, negativeAmountCanNotBeDeposited, InsufficientFundException {
        bank.deposit(BigDecimal.valueOf(10000),"1");
        assertEquals(BigDecimal.valueOf(10000), bank.checkBalance("1","0000"));
        bank.register("tolu","mide","0000");
        assertEquals(2, bank.getNoOfCustomer());
        bank.transfer("1","0000","2",BigDecimal.valueOf(5000));
        assertEquals(BigDecimal.valueOf(5000),bank.checkBalance("1","0000"));
    }

    @Test
    public void testThatBankCanWithdrawFromAccount() throws invalidCredentialsException, wrongPinException, negativeAmountCanNotBeDeposited, InsufficientFundException {
        bank.deposit(BigDecimal.valueOf(5000.00),"1");
        bank.withdraw(BigDecimal.valueOf(2000.00),"0000","1");
        assertEquals(BigDecimal.valueOf(3000.00), bank.checkBalance("1","0000"));
    }

    @Test
    public void checkBalanceTest() throws invalidCredentialsException, wrongPinException, negativeAmountCanNotBeDeposited {
        bank.deposit(BigDecimal.valueOf(3000.00),"1");
        assertEquals(BigDecimal.valueOf(3000.00), bank.checkBalance("1","0000"));
    }
}
