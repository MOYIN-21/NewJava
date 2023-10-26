package hackerRankTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String rev = "";

        int length = A.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + A.charAt(i);}

            if (A.equals(rev)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }


    }
}

