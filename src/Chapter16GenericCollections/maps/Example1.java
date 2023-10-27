package Chapter16GenericCollections.maps;
import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "TEN");
        map.put(11, "ELEVEN");

        String all = map.keySet().toString();
        System.out.println(map);

    }
}
