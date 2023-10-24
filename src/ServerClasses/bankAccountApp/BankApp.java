package ServerClasses.bankAccountApp;

import exceptions.InsufficientFundException;
import exceptions.invalidCredentialsException;
import exceptions.negativeAmountCanNotBeDeposited;
import exceptions.wrongPinException;

import javax.swing.*;
import java.math.BigDecimal;

import static java.lang.System.exit;


public class BankApp {
    private static String FirstName;
    private static String pin;
    private static final Bank EagleBank = new Bank();
    public static void main(String[] args) throws wrongPinException {
        String thrownException = "";
        while (thrownException == ""){
        try{
        bankAppMenu();
        }
        catch (StringIndexOutOfBoundsException | NumberFormatException | NullPointerException e){
            thrownException = e.getMessage();
            display("Invalid input");
        }
        thrownException = "";
        }
    }

    public static void bankAppMenu() throws wrongPinException {
        String bankAppMenu = """
                ===================================
                Welcome to EagleBank
                1 -> Create Account
                
                2 -> login
                
                3 -> Exit
                ===================================
                """;
        String userInput = input(bankAppMenu);
        switch (userInput.charAt(0)){
            case '1' -> createAccount();
            case '2' -> login();
            case '3' -> exitApplication();
            default -> {
                display("invalid input");
                bankAppMenu();
            }
        }
    }

    private static void login() throws wrongPinException {
        String UserName = input("Enter your user name");
        if (!UserName.equals(FirstName) | UserName.isEmpty()) {
            display("User name not found");
            login();}
        String pin = input("enter your security pin");
        if (pin.isEmpty() | !pin.equals(pin)) {
            display("Password can not be empty");
            login();}
        else {
                display("WELCOME TO WEMA BANK");
            menu();
        }
}

    private static void createAccount() throws wrongPinException {
        String firstName = input("Enter your first name");
        if (firstName.matches("\\D*")) {
        } else if(firstName.isEmpty()){
            display("first name can not be left empty, try again");
            createAccount();
        }
        String lastName = input("Enter your last name");
        if (lastName.matches("\\D*")) {
        } else if (lastName.isEmpty()) {
            display("last name can not be left empty, please try again");
            createAccount();
        }
        String pin = input("Enter your pin");
        if (pin.matches("^(0|[1-9]\\d*)")) {
        }else{
            display("enter pin");
            createAccount();
        }
        EagleBank.register(firstName, lastName, pin);
        display("Account created successfully");
        menu(); }


    public static void menu() throws wrongPinException{
    String menu = """
                ===================================
                Welcome to EagleBank
                1 -> Deposit
                
                2 -> Withdraw
                
                3 -> Transfer
                
                4 -> Check Balance
                
                5 -> Exit
                ===================================
                """;
    String usersInput = input(menu);
        switch (usersInput.charAt(0)){
            case '1' -> deposit();
            case '2' -> withdraw();
            case '3' -> transfer();
            case '4' -> checkBalance();
            case '5' -> exitApplication();
            default -> {
                display("invalid input");
                menu();
            }
        }
    }



    private static void exitApplication() {
        String name = "Thank you for using our application ";
        display(name);}

    private static void checkBalance() throws wrongPinException {
        try{
        String accountNumber = input("Enter Your Account Number");
        String pin = input("Enter Your Pin");
        String balance = String.valueOf(EagleBank.checkBalance(String.valueOf(accountNumber),pin));
            JOptionPane.showMessageDialog(null, "Your account Balance is " + balance);
        }
        catch (IllegalArgumentException | wrongPinException error){
        display(error.getMessage());}
        menu();}

    private static void transfer() throws wrongPinException {
        try{
            String senderPin = input("Enter your Pin");
            String senderAccountNumber = input("Enter sender account Number");
            String receiverAccountNumber = input("Enter receiver Account Number");
            BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Amount")));
            EagleBank.transfer(String.valueOf(senderAccountNumber),senderPin, String.valueOf(receiverAccountNumber),amount);
            String balance = String.valueOf(EagleBank.checkBalance(String.valueOf(senderAccountNumber), senderPin));
            JOptionPane.showMessageDialog(null,"You have succesfully tranfered" + amount + "to" + receiverAccountNumber + " " + "and your account balance is" + balance);
            }
        catch (IllegalArgumentException | invalidCredentialsException | wrongPinException |
               negativeAmountCanNotBeDeposited | InsufficientFundException error){
            display(error.getMessage());
            transfer();}
        menu();}

    private static void withdraw() throws wrongPinException {
        try{
        String accountNumber = input("Enter your account number");
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter your amount")));
        String pin = input("Enter your Pin");
        EagleBank.withdraw(amount,pin, String.valueOf(accountNumber));
        }
        catch (IllegalArgumentException | wrongPinException | InsufficientFundException ex){
            display(ex.getMessage());
            withdraw();}
        menu();}

    private static void deposit() throws wrongPinException {
        try{
        String accountNumber = input("Enter Your Account Number");
        BigDecimal amount = BigDecimal.valueOf(Long.parseLong(input("Enter Your Amount")));
        EagleBank.deposit(amount, accountNumber);
        } catch (invalidCredentialsException | negativeAmountCanNotBeDeposited e) {
            display(e.getMessage());
        }
        display("Deposit Successfully");
        menu();}


        public static String input(String Prompt){
            return JOptionPane.showInputDialog(Prompt);}
    public static void display(String prompt){
        JOptionPane.showInputDialog(null, prompt);
    }
}






