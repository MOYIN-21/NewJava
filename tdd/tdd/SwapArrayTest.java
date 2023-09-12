package tdd;

import org.junit.jupiter.api.Test;
import src.SwapArray;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapArrayTest {
    @Test

    public void swapElementAtIndexTest(){
        SwapArray swapArray = new SwapArray();

        int [] array = {5, 2, 6, 10, 9, 3};
        int[] actual = swapArray.switchElement(array,3,5);

        int [] expected = {5, 2, 6, 3, 9, 10};
        assertArrayEquals(expected, actual);
    }




}
