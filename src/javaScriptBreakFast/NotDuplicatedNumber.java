package javaScriptBreakFast;

public class NotDuplicatedNumber {
    public static void main(String[] args) {
        int[] array = {4, 4, 1, 3, 2, 2, 3, 3};
        int bottle = 0;
        int store = 0;
        for (int arr = 0; arr < array.length; arr++) {
            int bucket = 0;
            for (int non = 1; non < array[arr]; non++) {
                if (array[non] != array[arr]) {
                    bucket += 1;
                }
                if (bucket > bottle) {
                    bottle = bucket;
                    store = array[arr];
                }
            }
        }
        System.out.println(store);
    }
}




