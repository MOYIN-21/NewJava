package Chapter16GenericCollections.list;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(102);
        numbers.add(101);
        System.out.println(numbers);
    }
}
