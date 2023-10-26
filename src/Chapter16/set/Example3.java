package Chapter16.set;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1000);
        numbers.add(209);
        numbers.add(2009);
        System.out.println(numbers);
    }
}
