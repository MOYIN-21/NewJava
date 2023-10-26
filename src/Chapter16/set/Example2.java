package Chapter16.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();
        words.add("Gloreeeey");
        words.add("ABCD");
        words.add("EFGH");
        words.add("IJKLM");
        System.out.println(words);
    }
}
