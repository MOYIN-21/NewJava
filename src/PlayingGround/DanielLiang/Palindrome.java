package PlayingGround.DanielLiang;

import java.util.Scanner;

import static java.util.Collections.reverse;
import static java.util.Locale.filter;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();
// Display result
        System.out.println("Ignoring nonalphanumeric characters, \nis "
                + s + " a palindrome? " + isPalindrome(s));
    }


    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
    }
    public static String filter(String s) {
// Create a string builder
        StringBuilder stringBuilder = new StringBuilder();
// Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    /** Create a new string by reversing a specified string */
    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse(); // Invoke reverse in StringBuilder
        return stringBuilder.toString();
    }
}
