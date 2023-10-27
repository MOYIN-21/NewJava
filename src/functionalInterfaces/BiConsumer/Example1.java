package functionalInterfaces.BiConsumer;

import java.util.function.BiConsumer;

public class Example1 {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (a, b) -> {
            System.out.println(a.length() + b);
        };
        biConsumer.accept("Hello", 5);
    }
}
