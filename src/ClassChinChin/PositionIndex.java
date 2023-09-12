package ClassChinChin;

import PlayingGround.Array;

import java.util.Arrays;

public class PositionIndex {
    public static void main(String[] args) {
        int[] Array = {5, 18, 32, 3, 4};

        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));
        for(int index = Array.length-1; index> -1; index --){
            int Ar = Array[index];
            System.out.print(Ar + " ");
        }
    }
}