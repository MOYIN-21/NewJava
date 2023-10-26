package Chapter16.set;

import java.util.HashSet;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        words.add("Gloreeeey");
        words.add("ABCD");
        words.add("EFGH");
        words.add("IJKLM");


        System.out.println(words);
    }
}
