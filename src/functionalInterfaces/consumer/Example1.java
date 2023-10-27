package functionalInterfaces.consumer;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number)->{
            getSquare(number);
        };
        consumer.accept(90);
    }

    private static void getSquare(Integer number) {
        System.out.println(number*number);
    }
}
