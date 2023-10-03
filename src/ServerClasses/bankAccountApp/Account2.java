package ServerClasses.bankAccountApp;

import exceptions.InsufficientFundException;
import exceptions.negativeAmountCanNotBeDeposited;
import exceptions.wrongPinException;

import java.math.BigDecimal;

public class Account2 {

    private String pin;
    private String accountName;
    private BigDecimal balance = BigDecimal.ZERO;
    private String accountNumber;

    public Account2(String accountNumber, String userAccountName, String pin){
        this.accountName = userAccountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public BigDecimal checkBalance(String pin) throws wrongPinException {
        if (!this.pin.equals(pin)) throw new wrongPinException("WRONG PIN");
        else {
            return balance;
        }
    }
    public void deposit(BigDecimal amount) throws negativeAmountCanNotBeDeposited {
        if(amount.compareTo(BigDecimal.ZERO)<0) throw new negativeAmountCanNotBeDeposited("CAN NOT DEPOSIT NEGATIVE AMOUNT");
        else if (amount == null) {System.exit(0);
        } else{
        balance = balance.add(amount);}
    }


    public void withdraw(BigDecimal amount) throws InsufficientFundException {
        if (balance.compareTo(amount)<0) {
            throw new InsufficientFundException("INSUFFICIENT FUND");
        }else if (amount == null) {System.exit(0);}
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