package PlayingGround.HackerRack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class Multiples {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println(N + " X " + i + " = " + i * N);

    }
}
