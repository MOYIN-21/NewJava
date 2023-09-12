package PlayingGround;

import java.util.Arrays;

public class PositioningArrayElement {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6};
//        int counter = 0;
        for (int index = array.length-1; index >= 0; index--) {
            int grace = array[index];
//            System.out.println(array[counter]+ " ");
//            System.out.print("**************************");
            System.out.println(grace);
//            counter++;
        }
    }
}




