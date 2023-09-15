package src.MyDiary;

import javax.swing.*;

public class MainDiaryApplication {
private static Diary myDiary = new Diary("userName", "0000");

    public static void main(String[] args) {
        goToMainMenu();
    }

    private static void goToMainMenu(){
        String mainMenu = input(  """
                +++++++++++++++++++++++++++++++++++
                Welcome to Diary
                1 ->Create Entry
                2 ->Find Entry
                3 ->Delete Entry
                4 ->Update Entry
                5 ->Lock Diary
                6 ->Unlock Diary
                7 ->Exit
                ++++++++++++++++++++++++++++++++++++
                """);
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1' -> CreateEntry();
            case '2' -> FindEntry();
            case '3' -> DeleteEntry();
            case '4' -> UpdateEntry();
            case '5' -> LockDiary();
            case '6' -> unlockDiary();
            case '7' -> Exit();

        }
    }

    private static void unlockDiary() {

    }

    private static void LockDiary() {

    }

    private static void Exit() {
        display("Thanks");
        System.exit(1);
    }

    private static void UpdateEntry() {

    }

    private static void DeleteEntry() {
        String id = input("Enter id");
        myDiary.deleteEntry(Integer.parseInt(id));
        display("Entry successfully deleted");
        goToMainMenu();
    }

    private static void FindEntry() {
        String id = input("Enter id");
        myDiary.findEntry(Integer.parseInt(id));
        goToMainMenu();

    }

    private static void CreateEntry() {
        String id = input("Enter id");
        String title = input("Enter Titled");
        String body = input("Enter body");
        myDiary.createEntry(Integer.parseInt(id), title, body);
        display("Entry created successfully");
        goToMainMenu();
    }

    private static void display(String prompt){
        JOptionPane.showInputDialog(null, prompt);
    }

    private static String input(String Prompt){
        return JOptionPane.showInputDialog(Prompt);
    }

}
