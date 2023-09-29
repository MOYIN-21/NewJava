package playingGround.hackerRack;

import java.util.Scanner;

public class SelectionStatement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        numbers(scanner.nextInt());
    }

    public static void numbers(int N){

        if (N > 0 && N < 101){

            if (N % 2 != 0){
                System.out.println("Weird");
            }
            if(N % 2 == 0 && N <= 5){
                System.out.println("Not Weird");
            }
            if(N % 2 == 0 && (N >= 6 && N <= 20)){
                System.out.println("Weird");
            }
            if(N % 2 == 0 && N > 20){
                System.out.println("Not Weird");
            }

        }

    }
}


