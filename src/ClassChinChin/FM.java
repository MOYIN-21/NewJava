package ClassChinChin;

import java.util.Scanner;

import static java.lang.System.in;

public class FM {
    private static final Scanner keyboard = new Scanner(in);

    public static void main(String[] args) {
        name();
    }
    public static int name() {

        System.out.println("Enter your name");
        String input = keyboard.next();
        if (input.matches("\\D*")) {
            System.out.println("Hello" + " " + input);
        } else {
            System.out.println("invalid input");
            name();
        }

        return 0;
        }
    }

