package functionalInterfaces.supplier;

import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->"Y'hello";
//          return "Y'Hello";
//        };
        String result = supplier.get();
        System.out.println(result);
    }
}
