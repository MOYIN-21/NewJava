package chapter17Lamdas;

public class Example {
    public static void main(String[] args) {
        Flyable f1 = () -> {
            System.out.println("Flying fish");
        };
        f1.fly();
    }
}
