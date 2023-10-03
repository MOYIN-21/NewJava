package ServerClasses;

public class SwapArray {

    public int[] switchElement(int[] array, int index, int index1) {
            array[index] += array[index1];
            array[index1] = array[index] - array[index1];
            array[index] -= array[index] -array[index1];

//            array[2] = array[4];
//            array[4] = array[2];
//        System.out.println(Arrays.toString(array));
        return array;
    }
}
