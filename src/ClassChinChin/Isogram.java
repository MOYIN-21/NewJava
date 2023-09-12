package ClassChinChin;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class Isogram {
    private static final Scanner keyboard = new Scanner(in);

    public static void main(String[] args) {
        Isogram();}
    public static boolean Isogram() {
        System.out.println("Enter a statement");
        String input = keyboard.next();
        String only = input.replaceAll("\\s", "");
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(only);
        if (!matcher.find()) {
            System.out.println("True");
        } else
            System.out.println("False");;
        return false;
    }
}
