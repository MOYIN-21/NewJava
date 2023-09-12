package Snacks;

public class CheckElement {
    public static void main(String[] args) {
    int[] numbers = {457, 984, 324, 694, 100, 567, 3982};
        System.out.println(CheckElement(numbers,984));

                }
    public static boolean CheckElement(int[] numbers, int element){
        for (int number : numbers) {
        return number == element;
        }
        return false;
    }
}