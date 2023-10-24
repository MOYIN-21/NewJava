package snacks;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class EcommerceStore {
    //        private final static String localDate date = localDate .now();
    private static final String stores = "SEMICOLON STORES";
    private static final String branch = "MAIN BRANCH";
    private static final String location = "LOCATION: 312, HERBERT MACULAY WAY, SABO YABA, LAGOS.";
    private static final String tel = "TEL: 03293828343";
    private final static String localDateTime = String.valueOf(LocalDateTime.now());
    private static final String cashier = "Cashier: Cashier's Name";
    private static String customerName;
    private static final ArrayList<String> product = new ArrayList<>();
    private static final ArrayList<Integer> quantityPurchase = new ArrayList<>();
    private static final ArrayList<Double> price = new ArrayList<>();
//    private static Double discount;
//    private static String VAT;
    private static Scanner output = new Scanner(in);

    public static void main(String[] args) {
        name();
    }

    private static void name() {
        System.out.println("What is the customer's Name");
        String input = output.nextLine();
        customerName = input;
        if (input.matches("\\D*")) {
            userBuy();
        } else {
            System.out.println("invalid input");
            name();
        }
    }

    private static void userBuy() {
        System.out.println("What did the user buy?");
        String keyboard = output.nextLine();
        if (keyboard.matches("\\D*")) {
            product.add(keyboard);
            pieces();
        } else {
            System.out.println("invalid input");
            userBuy();
        }
    }

    private static void pieces() {
        System.out.println("How many pieces?");
        String num = output.nextLine();
        if (num.matches("^(0|[1-9]\\d*)")) {
            if (Integer.parseInt(num) >= 0) {
                quantityPurchase.add(Integer.valueOf(num)); unit();
            }
        } else {
            System.out.println("Invalid input");
            pieces();
        }
    }

    private static void unit() {
        System.out.println("How much per unit?");
        String amount = output.nextLine();
        if (amount.matches("^(0|[1-9]\\d*)")) {
            if (Integer.parseInt(amount) >= 0) {
                price.add(Double.valueOf(amount));
                item();
            }
    } else {
            System.out.println("Invalid input");
            unit();
        }
    }

    private static void item() {
        System.out.println("Add more Items?");
        String response = output.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            userBuy();
        }
        if (response.equalsIgnoreCase("No")){
            discount();
        }else{
            System.out.println("invalid input");
            item();
        }
    }

    private static void discount() {
        System.out.println("How much discount will he get?");
        String priceCut = output.nextLine();
        if (priceCut.matches("[0-9]+")) {
            System.out.println(" ");
        } else {
            System.out.println("invalid input");
            discount();
        }
        System.out.println(stores);
        System.out.println(branch);
        System.out.println(location);
        System.out.println(tel);
        System.out.println(localDateTime);
        System.out.println(cashier);
        System.out.println(customerName);
        System.out.println("=".repeat(70));

        for (int row = 0; row<product.size(); row++) {
        }
            System.out.println("\t\tITEM[1],QTY[1],PRICE[1], TOTAL(NGN)");
    }
}
