package snacks.implementation;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
     Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("lemon"));
        balls.add(new Ball("green"));
        balls.add(new Ball("green"));
        System.out.println(balls.size());
        System.out.println(balls.contains("purple"));
        balls.forEach(System.out::println);
    }
public record Ball(String color){}
}
