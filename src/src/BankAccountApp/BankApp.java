package src.BankAccountApp;

import javax.swing.*;
import java.math.BigDecimal;

import static java.lang.System.exit;


public class BankApp {
    private static final Bank wemaBank = new Bank();
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        String menu = """
                ===================================
                Welcome to Wema Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> Check Balance
                6 -> Exit
                ===================================
                """;
        String userInput = input(menu);
        switch (userInput.charAt(0)){
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> transfer();
            case '5' -> checkBalance();
            case '6' -> exitApplication();
            default -> exit(0);
        }
    }

    private static void exitApplication() {
        String name = "Thank you for using our application ";
        JOptionPane.showMessageDialog(null, name);
    }

    private static void checkBalance() {
        String accountNumber = input("Enter Your Account Number");
        String pin = input("Enter Your Pin");
        String accountBalance = String.format("""
       Your account Balance is %s""",
                wemaBank.checkBalance(String.valueOf(accountNumber),pin).toPlainString());
        display(accountBalance);
        menu();
    }


    private static void transfer() {
        String senderAccountNumber = input("Enter your Account Number");
        String receiverAccountNumber = input("Enter recipient Account Number");
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Amount")));
        String senderPin = input("Enter your Pin");
        try {
            wemaBank.transfer(String.valueOf(senderAccountNumber),senderPin, String.valueOf(receiverAccountNumber),amount);
        }
        catch (IllegalArgumentException error){
            display(error.getMessage());
            transfer();
        }
        menu();
    }

    private static void withdraw() {
        String accountNumber = input("Enter your account number");
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your Pin");
        try {
            wemaBank.withdraw(amount,pin, String.valueOf(accountNumber));
        }
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            withdraw();
        }
        menu();
    }

    private static void deposit() {
        String accountNumber = input("Enter Your Account Number");
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Your Amount")));
        wemaBank.deposit(amount, String.valueOf(accountNumber));
        display("Deposit successfully");
        menu();
    }

    private static void createAccount() {
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String pin = input("Enter your pin");
        wemaBank.register(firstName, lastName, pin);
        display("Account created successfully");
        menu(); }

        private static String input(String Prompt){
            return JOptionPane.showInputDialog(Prompt);
    }

    private static void display(String prompt){
        JOptionPane.showInputDialog(null, prompt);
    }
}






