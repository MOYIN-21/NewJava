package javaScriptBreakFast;

import java.util.Scanner;

import static java.lang.System.in;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String word = scanner.next();
        String anotherWord = scanner.next();
        boolean func = isAnagram(word, anotherWord);
        System.out.println((func)? "true" : "false");
    }

    public static boolean isAnagram(String word, String anotherWord) {
        boolean assurance = false;
        if (word.length() != anotherWord.length())
            return assurance;
        for (int counter = 0; counter <= word.length(); counter++) {
            int num = 0;
            int numb = 0;
            for (int count = 0; count < word.length(); count++) {
                if (word.charAt(counter) == anotherWord.charAt(count)) num ++;
                if (word.charAt(counter) != anotherWord.charAt(count)) numb ++;
            }
            if (num == numb) return true;
            else
                return assurance;
        }
        return true;
    }
}
