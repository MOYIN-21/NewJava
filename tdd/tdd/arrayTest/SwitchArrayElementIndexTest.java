package tdd.arrayTest;

import org.junit.Test;
import src.firstArray.SwitchArrayElementIndex;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SwitchArrayElementIndexTest {
    @Test
    public void arrayElementCanBeSwitchedTest() {
        SwitchArrayElementIndex switchArrayElementIndex = new SwitchArrayElementIndex();

        int[] array = {1, 2, 3, 4, 5, 6};
        int[] actual = switchArrayElementIndex.switchElement(array);

        int[] expected = {2, 1, 4, 3, 6, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void skipOddAndSubtractTwoInElementTest() {
        SwitchArrayElementIndex switchArrayElementIndex = new SwitchArrayElementIndex();

        int[] remove = {22, 41, 15, 8, 2, 1};
        int[] actual = switchArrayElementIndex.removeElement(remove);

        int[] expected = {39, 13, -1};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void elementCanBeBeAddedToArrayTest(){
        SwitchArrayElementIndex switchArrayElementIndex = new SwitchArrayElementIndex();

        int[] initialArray = {22, 41, 15, 8};
        int number = 2;
        int[] actual = switchArrayElementIndex.addElement(number,initialArray);

        int[] expected = {22, 41, 15, 8, 2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void elementCanBeReversedTest(){
        SwitchArrayElementIndex switchArrayElementIndex = new SwitchArrayElementIndex();

        int[] reverse = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = switchArrayElementIndex.reverseElement(reverse);

        int[] aexpected = {7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(aexpected,actual);
    }



}
