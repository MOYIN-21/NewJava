package snacks.implementation;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Moyin", 21));
        supermarket.add(new Person("Victor",  19));
        supermarket.add(new Person("Precious", 31));
        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static record Person(String name, int age){

    }
}
