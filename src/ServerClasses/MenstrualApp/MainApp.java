package ServerClasses.MenstrualApp;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class MainApp {

    public static class MainMenstrual {
        private final List<Date> periodStartDates = new ArrayList<>();
        private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        private int userInput;
        Menstrual menstrual = new Menstrual();



//        private final Scanner keyBoard = new Scanner(System.in);


        public void main(String[] args) {
//            MainMenstrual main = new MainMenstrual();
            welcomePage();

//
//            LocalDate startDate = LocalDate.parse("2023-09-22");
//            LocalDate nextFlowDate = startDate.plusDays(14);
//            System.out.println(nextFlowDate);
//            main.welcomePage();
        }

        public void welcomePage() {
            userInput = Integer.parseInt((String) prompt("""
                HELLO! WELCOME! TO EAGLE LADIES CARE
                                         
                                
                1. MENSTRUAL SAFE PERIOD
                                    
                2. OVULATION
                                    
                3. MENSTRUAL FLOW
                                
                4. CIRCLE LENGTH
                
                5. EXIT"""));
            switch (userInput) {
                case 1 -> safePeriod();
                case 2 -> ovulation();
                case 3 -> menstrualFlow();
                default -> exit(0);
            }
        }

        public SimpleDateFormat date() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }

        public void menstrualFlow() {
            Date inputDate = null;

            while (inputDate == null) {
                String userInput = (String) prompt("Enter the last day of your flow (yyyy-MM-dd): ");

                try {
                    inputDate = menstrual.findEndFlow(date().parse(userInput));
                    display("Hi dear, you can expect your next flow on " + inputDate);
                    welcomePage();

                } catch (ParseException e) {
                    display("Invalid date format. Please use yyyy-MM-dd.");
                }
            }

        }

        public void ovulation() {
            SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date ovulation = null;

            while (ovulation == null) {
                String userInput = (String) prompt("Enter the last day of your period (yyyy-MM-dd): ");

                try {
                    ovulation = menstrual.findSafePeriodStart(newDateFormat.parse(userInput));
                    display("Hi dear, your ovulation starts on: " + ovulation);
                    welcomePage();

                } catch (ParseException e) {
                    display("Invalid date format. Please use yyyy-MM-dd.");
                }
            }
        }

        public void safePeriod() {
            SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date endPeriod = null;
            Date startPeriod = null;

            while (endPeriod == null && startPeriod == null) {
                String userInput = (String) prompt("Enter the last day of your period (yyyy-MM-dd): ");

                try {
                    startPeriod = menstrual.findSafePeriodStart(newDateFormat.parse(userInput));
                    endPeriod = menstrual.findSafePeriodEnd(newDateFormat.parse(userInput));
                    display("Hi dear, your safe period starts on: " + startPeriod + " and ends on " + endPeriod);
                    welcomePage();

                } catch (ParseException e) {
                    display("Invalid date format. Please use yyyy-MM-dd.");
                }
            }
        }

        public String prompt(String message){
            return JOptionPane.showInputDialog(message);
        }
        public void display(String message){
            JOptionPane.showMessageDialog(null, message);
        }

    }
}
