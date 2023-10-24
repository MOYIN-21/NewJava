package ServerClasses.MenstrualApp;

import javax.swing.*;
import java.util.InputMismatchException;

public class MenstrualApp {
    private static MenstrualCalculator menstrualCalculator;

    public static void main(String[] args) {
        welcome();
        menu();
        startApplication();
    }



    private static void welcome() {
        display("""
                WELCOME TO EAGLE MENSTRUAL TRACKER
                """);}

    private static void menu() {
        String userInput =  input("""
                +++++++++++++++++++++++++++++++++++
                1. Enter Menstrual details
                2. Exit
                +++++++++++++++++++++++++++++++++++
                """);

        switch (userInput) {
            case "1" -> collectInput();
            case "2" -> exitApplication();
            default -> System.exit(1);
        }
    }

    private static void collectInput() {
        try{
            String startDate = input("Enter your last period date: ");
            int numberOfFlowDays = Integer.parseInt(input("Enter Menstrual cycle length: "));
            int cycleLength = Integer.parseInt(input("Enter "));

            validateDate(startDate);
            validateInput(numberOfFlowDays, cycleLength);

            menstrualCalculator = new MenstrualCalculator(startDate, cycleLength, numberOfFlowDays);
        }
        catch(IllegalArgumentException error){display(error.getMessage());}
        catch (InputMismatchException error){
            display("Invalid Input");
        }
    }

    private static void validateInput(int numberOfFlowDays, int cycleLength) {
        if (numberOfFlowDays > 7 || numberOfFlowDays <= 3)
            throw new IllegalArgumentException("Cycle length must be between 21 and 35");
        if(cycleLength > 35 || cycleLength < 21)
            display("DISCLAIMER: All calculations provided by our ovulation calculator are no more than just estimations. " +
                    "We make no claim of any perfect calculations. " +
                    "For a better prediction, you may visit your doctor on a regular basis.");
    }

    private static void startApplication() {
        String userInput = input("""
                                     +++++++++++++++++++++++++++++++++++
                                        1. Know Next Period Date.
                                        2. know Ovulation Period.
                                        3. know Fertility Period.
                                        4. know your Safe Period.
                                        5. Exit.
                                     +++++++++++++++++++++++++++++++++++
                                        """);
        switch (userInput){
            case "1" -> nextPeriod();
            case "2" -> ovulationPeriod();
            case "3" -> fertilityPeriod();
            case "4" -> safePeriod();
            case "5" -> exitApplication();
            default -> {
                display("Enter valid input");
                startApplication();
            }
        }
    }

    private static void nextPeriod() {

        try{
            String design = "!".repeat(30);
            display(String.format("""
                            %s
                            Next Period date is:  %s
                            to:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartDateOfNextPeriod(),
                    menstrualCalculator.getEndDateOfNextPeriod(),
                    design));
            startApplication();
        } catch (IllegalArgumentException | InputMismatchException | NullPointerException error){
            display(error.getMessage());
            safePeriod();
        }
    }

    private static void validateDate(String dateOfLastPeriod) {
        if (!dateOfLastPeriod.startsWith("2023"))
            throw new IllegalArgumentException("Please enter a valid datee");
    }

    private static void ovulationPeriod() {
        try{
            String design = "*".repeat(30);
            display(String.format("""
                            %s
                            Ovulation date is: %s
                            %s
                            """,
                    design,
                    menstrualCalculator.getOvulationDay(),
                    design));
            startApplication();
        } catch (IllegalArgumentException | NullPointerException error) {
            display(error.getMessage());
            ovulationPeriod();
        }
    }

    private static void fertilityPeriod() {
        String ovulationDate = input("Enter your Ovulation Day (Format: yyyy-mm-dd)");
        try{
            validateDate(ovulationDate);
            String design = "*".repeat(50);
            display(String.format("""
                            %s
                            Fertility Period Start on the:  %s
                            Fertility Period End on the:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartOfFertilityDate(),
                    menstrualCalculator.getEndOfFertilityDate(), design));
            startApplication();
        } catch (IllegalArgumentException | NullPointerException error){
            display(error.getMessage());
            fertilityPeriod();
        }
    }

    private static void safePeriod() {
        String dateOfLastPeriod = display(" Enter your last Period day date in this format Dakun oko mi (Format: yyyy-mm-dd)");
        try{
            validateDate(dateOfLastPeriod);
            int cycleLength = Integer.parseInt(input("Enter your cycle length "));
            int flowDays = Integer.parseInt(input("Enter your flow days"));
            String design = "!".repeat(30);
            display(String.format("""
                            %s
                            Safe Period Start on the:  %s
                            Safe Period End on the:  %s
                            %s
                            """,
                    design, menstrualCalculator.getStartOfSafePeriod(),
                    menstrualCalculator.getEndOfSafePeriod(),
                    design));
            startApplication();
        } catch (IllegalArgumentException | InputMismatchException | NullPointerException error){
            display(error.getMessage());
            safePeriod();
        }
    }

    private static void exitApplication() {
        System.exit(1);
    }


    private static String display(String message) {
        JOptionPane.showMessageDialog(null, message);
        return message;
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(null, prompt);
    }
}
