package PlayingGround.HackerRack;

import java.util.Scanner;

//import static sun.java2d.cmm.ColorTransform.In;

public class SquareRoot {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int answer = a;

            for (int j = 0; j < n; j++){
                answer= answer + (((int)Math.pow(2, j)) * b);
                System.out.print(answer + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
