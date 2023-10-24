package javaScriptBreakFast;

public class ReverseAllWord{
    public static void main(String[] args) {
        String[] word = {" The King is here there is no need to fear or fret"};
        System.out.println(reverse(word));
    }
    public static StringBuilder reverse(String [] word){
        StringBuilder  stringBuilder1 = new StringBuilder();
        for (int i = word.length-1; i >= 0; i--) {
            stringBuilder1.append(word[i]);
        }
        return stringBuilder1.reverse();
    }
}
