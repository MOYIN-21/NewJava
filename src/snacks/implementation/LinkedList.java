package snacks.implementation;

import java.util.ListIterator;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<person> linkedList = new java.util.LinkedList<>();
        linkedList.addFirst(new person("Moyin", 21));
        linkedList.add(new person("Taiwo",14));
        linkedList.addLast(new person("Dorcas", 11));
        ListIterator<person> personListIterator = linkedList.listIterator();
//        while (personListIterator.hasNext()){
//            System.out.println(personListIterator.next());
//        }
//        System.out.println();
//        while (personListIterator.hasPrevious()){
//            System.out.println(personListIterator.hasPrevious());
//        }
        System.out.println(linkedList);

    }
    public record person(String name, int age){}
}


