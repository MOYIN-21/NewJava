package PlayingGround.HackerRack;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double m = scan.nextDouble();
        scan.nextLine();
        String n = scan.nextLine();

        System.out.println("String: " + n);
        System.out.println("Double: " + m );
        System.out.println("Int: " + i);
    }
    }

