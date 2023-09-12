package ClassChinChin;

import java.util.Scanner;

import static java.lang.System.in;

public class FM3 {

    private static final Scanner keyboard = new Scanner(in);

    public static void main(String[] args) {
        numbers();
    }
    public static int numbers() {
        System.out.println("Enter a number between 1 and 10");
        int input = keyboard.nextInt();
        if (input == 1) {
            System.out.println("You entered one");
        } else if (input == 2) {
            System.out.println("You entered two");
        } else if (input == 3) {
            System.out.println("You entered three");
        } else if (input == 4) {
            System.out.println("You entered four");
        } else if (input == 5) {
            System.out.println("You entered five");
        } else if (input == 6) {
            System.out.println("You entered six");
        } else if (input == 7) {
            System.out.println("You entered seven");
        } else if (input == 8) {
            System.out.println("You entered eight");
        } else if (input == 9) {
            System.out.println("You entered nine");
        } else if (input == 10) {
            System.out.println("You entered ten");
        } else {
            System.out.println("invalid input");
            numbers();
        }
        return input;
    }
}
