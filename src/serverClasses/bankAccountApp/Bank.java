package serverClasses.bankAccountApp;

import exceptions.InsufficientFundException;
import exceptions.invalidCredentialsException;
import exceptions.negativeAmountCanNotBeDeposited;
import exceptions.wrongPinException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account2> accounts = new ArrayList<>();
    private String bankName;
    private Account2 account2;
    public Bank() {
        this.bankName = bankName;
    }




    public void register(String firstName, String lastName, String pin) {
        String fullName = firstName + " " + lastName;
        String accountNumber = generateAccountNumber();
        account2 = new Account2(generateAccountNumber(),fullName, pin);
        accounts.add(account2);
    }

    private String generateAccountNumber() {
        return accounts.size() + 1 + "";
    }

    public Account2 findAccount(String accountNumber) {
        for (Account2 account : accounts) {
            if (accountNumber.isEmpty()){
                System.exit(1);}
            else if (account.getAccountNumber().equals(accountNumber)) {
                  return account;}}
        return null;
    }

    public void deposit(BigDecimal amount, String accountNumber) throws invalidCredentialsException, negativeAmountCanNotBeDeposited {
        Account2 accountFound = findAccount(accountNumber);
        if (accountFound == null ){
            throw new invalidCredentialsException("ACCOUNT NOT FOUND");}
        else {
            account2.deposit(amount);}
        if (amount ==null){
            System.exit(1);
        }
    }

    public BigDecimal checkBalance(String accountNumber, String pin) throws wrongPinException {
        return findAccount(accountNumber).checkBalance(pin);
    }

    public void withdraw(BigDecimal amount, String pin, String accountNumber) throws wrongPinException, InsufficientFundException {
        findAccount(accountNumber);
        account2.checkBalance(pin);
        account2.withdraw(amount);
    }

    public void transfer(String senderAccountNumber,String pin, String receiverAccountNumber, BigDecimal amount) throws invalidCredentialsException, wrongPinException, negativeAmountCanNotBeDeposited, InsufficientFundException {
        Account2 accountSender = findAccount(senderAccountNumber);
        checkBalance(senderAccountNumber, pin);
        if (accountSender == null) {
            throw new invalidCredentialsException("ACCOUNT NUMBER NOT FOUND");
        } else {
            accountSender.withdraw(amount);}
        Account2 accountReceiver = findAccount(receiverAccountNumber);
        if (accountReceiver == null) {
            throw new invalidCredentialsException("ACCOUNT NUMBER NOT FOUND");
        } else {
            accountReceiver.deposit(amount);
        }
    }

    public int getNoOfCustomer(){
        return accounts.size();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", account2=" + account2 +
                '}';
    }
}
