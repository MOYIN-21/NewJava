package firstAccount;

import org.junit.Test;
import serverClasses.firstAccount.Account;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AccountTest {
    @Test
    public void setUpAccount(){
        Account moyinAccount = new Account("1990");
        assertNotNull(moyinAccount);
    }
    @Test
    public void canDepositIntoAccount(){
        Account moyinAccount = new Account("1990");
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(0,currentBalance);
        moyinAccount.deposit(5000);
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,newBalance);
    }

    @Test
    public void canDepositIntoAccountTwiceTest(){
        Account moyinAccount = new Account("1990");
        moyinAccount.deposit(5000);
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,currentBalance);
        moyinAccount.deposit(2000);
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(7000,newBalance);
    }

    @Test
    public void canNotDepositNegativeValueIntoAccountTest(){
        Account moyinAccount = new Account("1990");
        moyinAccount.deposit(5000);
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,currentBalance);
        moyinAccount.deposit(-2000);
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,newBalance);
    }

    @Test
    public void canDepositAboveBalanceTest(){
        Account moyinAccount = new Account("1990");
        moyinAccount.deposit(5000);
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,currentBalance);
        moyinAccount.deposit(15000);
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(20000,newBalance);
    }


    @Test
    public void withdrawalTest(){
        Account moyinAccount = new Account("1990");
        moyinAccount.deposit(5000);
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,currentBalance);
        moyinAccount.withdraw(2000, "1990");
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(3000,newBalance);
    }

    @Test
    public void canWithdrawWithPinTest(){
        Account moyinAccount = new Account("1990");
        moyinAccount.deposit(5000);
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,currentBalance);
        moyinAccount.withdraw(2000,"1990");
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(3000,newBalance);
    }
    @Test
    public void canNotWithdrawWithdrawAboveBalanceTest(){
        Account moyinAccount = new Account("1990");
        moyinAccount.deposit(5000);
        int currentBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,currentBalance);
        moyinAccount.withdraw(7000,"1990");
        int newBalance = moyinAccount.getBalance("1990");
        assertEquals(5000,newBalance);
    }


}
