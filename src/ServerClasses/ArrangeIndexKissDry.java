package ServerClasses;

public class ArrangeIndexKissDry {


    public static String kissDryIndex(int[] numbers) {
        String pattern = "kissdry";
        String output = "";
        int count = 0;
        for (int number: numbers){
            for (int index = 0; index < pattern.length(); index++) {
                if (number == index) {
                    output += pattern.charAt(index);
                    break;
                }
            }
        }
        return output;
    }
}
