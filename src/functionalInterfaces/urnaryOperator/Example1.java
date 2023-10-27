package functionalInterfaces.urnaryOperator;

import java.util.function.UnaryOperator;

public class Example1 {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator =(number)->number * number;
        System.out.println(unaryOperator.apply(20));

    }
}
