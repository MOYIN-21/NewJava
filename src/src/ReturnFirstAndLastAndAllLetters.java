package src;

public class ReturnFirstAndLastAndAllLetters {

    public static String firstLetter(String name) {
       String[] arr = name.split(" ");
       String vary = "";
       for (String names : arr) {
           vary += names.charAt(0)+ ".";
       }
       vary += arr[arr.length -1];
             return  vary;
    }
}
