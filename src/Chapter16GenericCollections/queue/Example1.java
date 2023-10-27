package Chapter16GenericCollections.queue;
import Chapter16GenericCollections.set.Dog;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Dog> dogs = new ArrayBlockingQueue<>(1);
        dogs.add(new Dog("Bingo"));
        System.out.println(dogs);

    }
}
