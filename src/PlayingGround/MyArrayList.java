package PlayingGround;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("books");
        items.add("pen");
        items.add("shoes");
        items.add("bags");

        for (int i = 0; i < items.size(); i++){
            System.out.println("My item is" + " " + items.get(i));
            items.remove(1);
            System.out.println(String.valueOf(items));
            System.out.println(items.size());
            System.out.printf(String.valueOf(items.contains("bags")));
        }



    }



}
