package snacks.implementation;
import java.util.Map;
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap();
        map.put(1, new Person("Moyin"));
        map.put(3,new Person("Dorcas"));
        map.put(2, new Person("Ezekiel"));
        map.put(2, new Person("Ezekiel"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

    }
    public record Person(String name){}
}
