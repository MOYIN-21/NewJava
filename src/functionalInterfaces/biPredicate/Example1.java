package functionalInterfaces.biPredicate;

import java.util.function.BiPredicate;

public class Example1 {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate =(word, number)-> word.length() == number;
        System.out.println(biPredicate.test("Hello", 5));
    }
}
