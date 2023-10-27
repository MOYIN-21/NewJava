package functionalInterfaces.consumer;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(100);

        Consumer<Integer> consumer = (number)->{
            System.out.println((number));
        };
        numbers.forEach(consumer);
    }

    private static void getSquare(Integer number) {
        System.out.println(number*number);

    }
}
