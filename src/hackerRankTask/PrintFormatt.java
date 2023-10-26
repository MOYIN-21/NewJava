package hackerRankTask;

import java.util.Scanner;

import static java.lang.System.in;

public class PrintFormatt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}

