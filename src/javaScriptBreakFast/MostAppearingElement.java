package javaScriptBreakFast;
public class MostAppearingElement {
    public static void main(String[] args) {

        int[] element = {3, 2, 2, 2, 2, 3};
        int bottle = 0;
        int store = 0;
        for (int arr = 0; arr< element.length; arr++){
            int bucket = 0;
            for (int non = 1; non< element[arr]; non++){
                if (element[non] == element[arr]){
                    bucket+= 1;
                }
                if (bucket > bottle){
                    bottle = bucket;
                    store = element[arr];
                }
            }
        }
        System.out.println(store);
    }
}
