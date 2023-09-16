package src.MyDiary;

import javax.swing.*;
import java.util.InputMismatchException;


public class DiaryApp {
    private static String userName;
    private static String password;
private static final Diaries myDiary = new Diaries();

    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu(){
        String mainMenu ="""
                +++++++++++++++++++++++++++++++++++
                Welcome to Diary
                1 ->Create Diary
                2 ->Login Diary
                3 ->Exit
                ++++++++++++++++++++++++++++++++++++
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createDiary();
            case '2' -> loginDiary();
            case '3' -> exit();
            default -> System.exit(1);
        }
    }
    private static void exit() {
        System.exit(0);
    }

    private static void loginDiary() {
        String user = input("Enter user name");
        if (!user.equals(userName)){
            JOptionPane.showMessageDialog(null, "User name not found");
            loginDiary();
        }
        String security = input("Enter your password");
        if (!security.equals(password)){
            JOptionPane.showMessageDialog(null,"Your password did not match your user name, try again");
            loginDiary();
        }
        mainDiaryMenu();
    }

    private static void createDiary() {
        String userName = input("Enter your user name");
        if (userName.isEmpty()){
            JOptionPane.showMessageDialog(null, "user name can not be empty");
            createDiary();
        }
        String password = input("Enter password for unlocking your diary");
        if (password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Password can not be empty");
            createDiary();
        }
        myDiary.addUser(userName, password);
        String message = "Hello" + " " + userName + " your Diary has been created successfully.";
        JOptionPane.showMessageDialog(null, message);
        loginDiary();
    }


    private static void mainDiaryMenu() {
        String mainMenu ="""
                +++++++++++++++++++++++++++++++++++
                1 ->Create Entry
                2 ->Find Entry
                3 ->Delete Entry
                4 ->Update Entry
                5 ->Lock Diary
                7 ->Exit
                ++++++++++++++++++++++++++++++++++++
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> createEntry();
            case '2' -> findEntry();
            case '3' -> deleteEntry();
            case '4' -> updateEntry();
//            case '5' -> LockDiary();
//            case '6' -> unlockDiary();
//            case '7' -> Exit();
            default -> exit();
        }
    }

    private static void updateEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");
            createDiary();
        }
        String title = input("Enter titled");
        String body = input("Enter body");
        myDiary.findByUserName(userName).updateEntry(Integer.parseInt(id), title, body);
        String message = "Entry updated successfully";
        JOptionPane.showMessageDialog(null, message);


    }

    private static void deleteEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");}
            deleteEntry();
        myDiary.findByUserName(id).deleteEntry(Integer.parseInt(id));
        String message = "Entry deleted successfully";
        JOptionPane.showMessageDialog(null, message);
        mainDiaryMenu();
    }


    private static void findEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");}
        if (id.equals(0)){
            findEntry();
            throw new InputMismatchException("Invalid id");
        }
        myDiary.findByUserName(userName).findEntry(Integer.parseInt(id)).getEntry();


        mainDiaryMenu();
    }

    private static void createEntry() {
        String id = input("Enter id");
        if (!id.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Id should be number, try again");
            createDiary();
        }
        String title = input("Enter titled");
        String body = input("Enter body");
        myDiary.findByUserName(userName).createEntry(Integer.parseInt(id), title, body);
        String message = "Entry created successfully.";
        JOptionPane.showMessageDialog(null, message);
        JOptionPane.showMessageDialog(null, title);
        JOptionPane.showMessageDialog(null, body);
        mainDiaryMenu();
    }

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
    }

}
