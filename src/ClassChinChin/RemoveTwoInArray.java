package ClassChinChin;

public class RemoveTwoInArray {
    public static void main(String[] args) {
        int [] subtract = {22, 41, 15, 8, 2, 1};
        for (int counter = 0; counter < subtract.length; counter++) {
            if (subtract[counter] % 2 != 0) {
                int skip = subtract[counter] - 2;
                System.out.print(skip + ", ");
            }

        }

    }
}
