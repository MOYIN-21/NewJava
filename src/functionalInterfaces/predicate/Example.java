package functionalInterfaces.predicate;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)->{
            return word.length()>5;
//            Predicate<String> predicate = (word)-> word.length()>5;
        };
        System.out.println(predicate.test("yes"));

    }
}
