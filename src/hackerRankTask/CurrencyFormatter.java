package hackerRankTask;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String... args) {
        System.out.println("Welcome");
        currency();
    }

    private static void currency() {

        try {
            double payment = inputCollector();
            String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
            String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
            String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
            String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);}
        catch (InputMismatchException e){
            System.out.println("Invalid input");
            currency();
        }

    }



    private static double inputCollector() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any amount");
        double payment = scanner.nextDouble();
        if (payment < 1)
            System.out.println("Invalid input, try again");{
            inputCollector();
        }
        return payment;
    }
}
