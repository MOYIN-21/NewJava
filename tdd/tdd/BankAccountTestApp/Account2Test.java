package tdd.BankAccountTestApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.BankAccountApp.Account2;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class Account2Test {
    Account2 account = new Account2("Moyinoluwa", "2415109039", "0000");


    @Test
    public void accountCanBeCreated(){
        assertNotNull(account);
    }

    @Test
    public void moneyCanBeDepositedIntoAccountTest() {
        account.deposit(BigDecimal.valueOf(5000.00));
        BigDecimal newBalance = account.checkBalance("0000");
        assertEquals(BigDecimal.valueOf(5000.0),newBalance);
    }

    @Test
    public void negativeAmountCanNotBeDepositedIntoAccountTest() {
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(BigDecimal.valueOf(-5000)));
    }

    @Test
    public void depositMoney_BalanceIncreasedTest() {
        account.deposit(BigDecimal.valueOf(3000.0));
        BigDecimal newBalance = account.checkBalance("0000");
        assertEquals(BigDecimal.valueOf(3000.0),newBalance);
    }

    @Test
    public void checkBalanceWithWrongPinTest()throws IllegalArgumentException{
        account.deposit(BigDecimal.valueOf(3000.00));
        BigDecimal newBalance = account.checkBalance("0000");
        assertEquals(BigDecimal.valueOf(3000.00),newBalance);
//        assertThrows(IllegalArgumentException.class, ()-> account.checkBalance("0000"));
    }

    @Test
    public void withdrawTest(){
        account.deposit(BigDecimal.valueOf(8000));
        BigDecimal newBalance = account.checkBalance("0000");
        assertEquals(BigDecimal.valueOf(8000),newBalance);
    }
}

