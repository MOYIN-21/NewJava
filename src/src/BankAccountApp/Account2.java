package src.BankAccountApp;

import java.math.BigDecimal;
import java.util.Objects;

public class Account2 {

    private String pin;
    private String accountName;
    private BigDecimal balance = BigDecimal.ZERO;
    private String accountNumber;

    public Account2(String accountName, String accountNumber, String pin){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public BigDecimal checkBalance(String pin) {
        if (!this.pin.equals(pin)) throw new IllegalArgumentException("WRONG PIN");
        else {
            return balance;
        }
    }
    public void deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO)<0) throw new IllegalArgumentException("CAN NOT DEPOSIT NEGATIVE AMOUNT");
        else{
        balance = balance.add(amount);}
    }
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount)<0) {
            throw new IllegalArgumentException("INSUFFICIENT FUND");
        }
        balance = balance.subtract(amount);
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public String canChangePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)){
            this.pin = newPin;
        }
        return newPin;
    }
}