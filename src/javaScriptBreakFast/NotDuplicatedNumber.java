package javaScriptBreakFast;

public class NotDuplicatedNumber {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 2, 3, 3};
        int newNum = 0;
        for (int non = 1; non < array.length; non++) {
            int variable = 0;
            for (int num = 0; num < array[non]; num++) {
                if (array[non] == array[num]) {
                    variable += 1;
                }
                if (variable <= 1) {
                    newNum = array[num];
                }
            }

        }
            System.out.println(array[newNum]);
        }
    }


