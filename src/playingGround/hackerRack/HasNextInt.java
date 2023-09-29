package playingGround.hackerRack;

import java.util.Scanner;

public class HasNextInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text (Ctrl+D or Ctrl+Z to exit):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("You entered: " + input);
        }

        scanner.close();
    }
}
