package src.phoneBookContact;

import javax.swing.*;

public class PhoneBookApp {
    public static final PhoneBook iPhone = new PhoneBook("userName", "password");

    public static void main(String[] args) {
        phoneBookMenu();}

    private static void phoneBookMenu() {
        String mainMenu = """
                1 -> Open Phone Book
                2 -> Login Phone book
                3 -> Exit""";
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> openPhoneBook();
            case '2' -> loginPhoneBook();
            case '3' -> Exit();
            default -> System.exit(1);
        }
    }

    private static void Exit() {
    }

    private static void loginPhoneBook() {
    }

    private static void openPhoneBook() {
        String userName = input("Enter User name");
        if(userName.isEmpty()){
            JOptionPane.showMessageDialog(null, "user name can not be empty, olease try again");
            openPhoneBook();
        String password = input("Enter a secure pasword");
        if (password.isEmpty()){
            JOptionPane.showMessageDialog(null, "passwor must be entered");
            openPhoneBook();
        }
        iPhone.unLocked(password);
        }
    }

    private static String input(String message) {
        return JOptionPane.showInputDialog(message);

    }
}
