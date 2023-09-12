package Snacks;

import java.util.Scanner;

public class CreditCard {
    private static String visaCard;
    private static String masterCard;
    private static String americaExpressCards;
    private static String discoverCard;
    private static String invalid;
    private static int doubleSecondDigit;
    private static int sumOfOdd;
    private static int length;
    private static int total;
    private static String validStatus;
    private static String convertedInput;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        collectCardDetails();
    }
    private static void collectCardDetails() {
        System.out.println("Hello, kindly enter card details to verify");
        Long output = input.nextLong();

        String converter = "";
        convertedInput = output + converter;
        length = convertedInput.length();
        cardType();
    }
    public static void cardType() {
        int[] numberBank = new int[length];
        for (int row = 0; row < convertedInput.length(); row++) {
            numberBank[row] = Integer.parseInt(String.valueOf(convertedInput.charAt(row)));
        }
            if (numberBank[0] == 4) {
                visaCard = "Credit Card Type: VisaCard";
                System.out.println(visaCard);
            }
            if (numberBank[0] == 5 && numberBank[1] != 0) {
                masterCard = "Credit Card Type: MasterCard ";
                System.out.println(masterCard);
            }
            if (numberBank[0] == 3 && numberBank[1] == 7) {
                americaExpressCards = "Credit Card Type: America Express Card ";
                System.out.println(americaExpressCards);
            }
            if (numberBank[0] == 6) {
                discoverCard = "Credit Card Type: Discover Card ";
                System.out.println(discoverCard);
            }
            if (numberBank[0] == 5 && numberBank[1] == 0) {
                discoverCard = "Credit Card Type: Verve Card ";
                System.out.println(discoverCard);
        }
            System.out.println(" ");

            for (int  doubling = convertedInput.length() - 1; doubling >= 0; doubling--) {
                if (doubling % 2 == 0) {
                    int box = numberBank[doubling] * 2;
                    if (box < 10) {
                        doubleSecondDigit += box;
                    } else {
                        String box2 = String.valueOf(box);
                        for (int separetNumber = 0; separetNumber < box2.length(); separetNumber++) {
                            int box3 = Integer.parseInt(String.valueOf(box2.charAt(separetNumber)));
                            doubleSecondDigit += box3;
                        }
                    }
                }
                for (int addOdd = 0; addOdd < convertedInput.length(); addOdd++) {
                    if (addOdd % 2 != 0) {
                        sumOfOdd += numberBank[addOdd];
                    }
                }
                total = sumOfOdd + doubleSecondDigit;
                if (total % 10 == 0) {
                    validStatus = "Card is valid";
                } else validStatus = "Card is not valid";
            }
            System.out.println("Card number is " + convertedInput);
            System.out.println("Card length is " + length);
            System.out.println("Card validity is " + validStatus);
        }
    }


