package serverClasses.firstArray;


public class SwitchArrayElementIndex {

    public int[] switchElement(int[] array) {
        for (int count = 0; count < array.length; count += 2) {
            int swap = array[count];
            array[count] = array[count + 1];
            array[count + 1] = swap;
        }
        return array;
    }

    public int[] removeElement(int[] remove) {
        for (int counter = 0; counter < remove.length; counter -= 2) {
            if (remove[counter] % 2 != 0){
        }
    }
        return remove;
    }

    public int[] addElement(int number, int[] numbers) {
        int[] newArray = new int[numbers.length + 1];
        int index = 0;
        for(int element: numbers){
            newArray[index] = element;
            index++;
            newArray[newArray.length - 1] = number;

        }

//        for (int index = 0; index < numbers.length; index++) {
//            newArray[index] = numbers[index];
//        }
//        newArray[newArray.length - 1] = number;
       return newArray;
    }

    public int[] reverseElement(int[] reverse) {
        int temp = 0;
        for (int counter = 0; counter < reverse.length /2; counter++) {
            temp = reverse[counter];
            reverse[counter] = reverse[reverse.length-counter-1];
            reverse[reverse.length-counter-1] = temp;

        }
        for ( int b : reverse){

        }
        return reverse;

    }


}









