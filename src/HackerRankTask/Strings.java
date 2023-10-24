package HackerRankTask;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        }
    }
}


