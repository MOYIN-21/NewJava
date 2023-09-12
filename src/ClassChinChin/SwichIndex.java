package ClassChinChin;

import PlayingGround.Array;

import java.util.Arrays;

public class SwichIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 > 0) {
                System.out.print(array[index]);
            }
            if (array[index] %2 == 0){
                System.out.print(array[index] + 2);
            }
            int temp= array[0];
            array[0] = array[1];
            array[1] = temp;
        }
    }
}




