package ClassChinChin;

import java.util.Scanner;

import static java.lang.System.in;

public class FM2 {
    public static void main(String[] args) {
        Scanner output = new Scanner(in);
        System.out.println("Enter a number between 1 t0 10");
        int input = output.nextInt();
        if(input <0 || input > 10){
            System.out.println("invalid input");
        } else if (input == 1) {
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
        }

    }
}
