package hackerRankTask;

import java.io.IOException;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i;
        for (i = 1; i <= 10; i++)
            System.out.println(N + " X " + i + " = " + i * N);

    }
}
