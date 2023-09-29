package src.firstAccount;

public class Account {

    private final String PIN;
    private int balance;

    public Account(String pin) {
        this.PIN = pin;
    }


    public int getBalance(String pin) {
        if (PIN != pin) return 0;
        return balance;
    }

    public int deposit(int amount) {
        if(amount < 0) return balance;
        if (amount > 100000) return balance;
        balance = balance + amount;
        return balance;
    }

    public int withdraw(int amount, String pin) {
        if (PIN != pin) return 0;
        if(amount > balance) return balance;
        balance = balance - amount;
        return balance;
    }
}
