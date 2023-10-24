package javaScriptBreakFast;
import java.util.Arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        String word = "stem";
        String words = "stream";
        System.out.println(isSubsequence(word, words));
    }

    public static boolean isSubsequence(String word, String words) {
            int first=0;
            int second=0;
            while(first<word.length() && second<words.length()){
                if(word.charAt(first)==words.charAt(second)){
                    first++;
                }
                second++;
                if(first==word.length())
                    return true;
            }
            return false;
    }
}
