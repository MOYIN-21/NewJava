package src.BankAccountApp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }else {
                throw new IllegalArgumentException("ACCOUNT NOT FOUND");
            }
        }
        return null;
    }

    public void deposit(BigDecimal amount, String accountNumber) {
        if (account2 == null) {
            throw new IllegalArgumentException("ACCOUNT NOT FOUND");
        }else{
                findAccount(accountNumber).deposit(amount);
            }
    }

    public BigDecimal checkBalance(String accountNumber, String pin) {
        return findAccount(accountNumber).checkBalance(pin);
    }

    public void withdraw(BigDecimal amount, String pin, String accountNumber){
        findAccount(accountNumber);
        account2.checkBalance(pin);
        account2.withdraw(amount);
    }

    public void transfer(String senderAccount,String pin, String receiverAccount, BigDecimal amount){
        Account2 accountSender = findAccount(senderAccount);
        accountSender.withdraw(BigDecimal.ZERO);
        Account2 accountReceiver = findAccount(receiverAccount);
        accountReceiver.deposit(BigDecimal.ZERO);
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
