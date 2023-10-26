package Chapter16.set;

import org.jetbrains.annotations.NotNull;

public class Dog implements Comparable{
    private  String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }

//    @Override
//    public int compareTo(Dog dog) {
//        return  dog.name.compareTo(this.name);
//    }

//    @Override
//    public int compareTo(Dog dog) {
//        return  this.name.compareTo(dog.name);

}

