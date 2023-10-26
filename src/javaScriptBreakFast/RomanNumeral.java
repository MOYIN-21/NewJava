package javaScriptBreakFast;

public class RomanNumeral {
    public static void main(String[] args) {
        String figure = "x";
        System.out.println(roman(figure));
    }

    private static String roman(String figure) {
        String list = String.valueOf("");
        if(figure.equalsIgnoreCase("I")){
            figure = String.valueOf(1);
            list+=figure;
        }else if(figure.equalsIgnoreCase("V")){
            figure = String.valueOf(5);
            list+=figure;
        } else if (figure.equalsIgnoreCase("X")) {
            figure = String.valueOf(10);
            list+=figure;
        } else if (figure.equalsIgnoreCase("L")) {
            figure = String.valueOf(50);
            list+=figure;
        } else if (figure.equalsIgnoreCase("C")) {
            figure = String.valueOf(100);
            list+=figure;
        } else if (figure.equalsIgnoreCase("D")) {
            figure = String.valueOf(500);
            list+=figure;
        } else if (figure.equalsIgnoreCase("M")) {
            figure = String.valueOf(1000);
            list+=figure;
        }
        return list;
    }
}
