package snacks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentGrade {
    private final Scanner input = new Scanner(System.in);
    private  int numberOfStudent;
    private  int numberOfSubject;

    private int sumStore ;

    private final DecimalFormat format = new DecimalFormat("#.00");
    String [][] markInput;





    public static void main(String[] args) throws InterruptedException {
        StudentGrade studentGrade = new StudentGrade();
        studentGrade.EntryCollection();
        System.out.println("=".repeat(10* studentGrade.numberOfSubject));
        studentGrade.insert();
        studentGrade.tableHead();
        System.out.println();
        System.out.println("=".repeat(10* studentGrade.numberOfSubject));
        studentGrade.tableBody();
    }

    public  void EntryCollection()  throws InterruptedException{
        System.out.println("How many student do you have? ");
        int numberOfStudent = input.nextInt();


        System.out.println("How many subject do they offer? ");
        int numberOfSubject = input.nextInt();

        if (numberOfStudent > 0 && numberOfSubject > 0) {
            this.numberOfStudent = numberOfStudent + 1;
            this.numberOfSubject = numberOfSubject + 4;
            markCollector();


        }
        else{
            System.out.println("invalid input, try again");
            EntryCollection();}


    }
    public void markCollector () throws InterruptedException {
        String[][] mark = new String[numberOfStudent][numberOfSubject];
        int sum = 0;



        double average;
        int index;

        for ( index = 1; index <= mark.length - 1; index++) {
            for (int index2 = 1; index2 <= mark[index].length - 4; index2++) {

                System.out.println("Entering score for student" + " " + index);
                System.out.println("Entering score for subject " + " " + index2);
                int score = input.nextInt();
                mark[index][index2] = String.valueOf(score);
                if (score >= 0 & score <= 100) {
                    loading();
                    sum += score;
                    average = (double) sum / index2;


                    mark[index][numberOfSubject - 3] = String.valueOf(sum);
                    mark[index][numberOfSubject - 2] = String.valueOf(format.format(average));

                } else {
                    System.out.println("invalid entry");

                }


            }
        }


        markInput = mark;

    }

    public void loading() throws InterruptedException {

        System.out.println("Saving");
        for(int index = 0; index < 30; index++)   {
            System.out.print(">");
            Thread.sleep(30);
        }
        System.out.println("\nSaved successfully");

    }
    public void positioning() {
    }



    public void insert() {
        for (int index = 1; index < numberOfSubject; index++) {
            markInput[0][index] = "sub" + index;
        }
        for (int index = 1; index < numberOfStudent; index++) {
            markInput[index][0] = "Student" + index;

        }
        markInput[0][numberOfSubject - 3] = "Tot";
        markInput[0][numberOfSubject - 2] = "AVG";
        markInput[0][numberOfSubject - 1] = "Pos";


    }
    public void  tableHead(){
        markInput[0][0] = "Student";
        for (int index = 0; index < markInput[0].length; index++){

            System.out.printf("%10s", markInput[0][index]);
        }
    }
    public void tableBody() {


        for (int index = 1; index < markInput.length; index++) {
            for (int indices = 0; indices < markInput[index].length; indices++) {
                System.out.printf("%10s", markInput[index][indices]);
            }
            System.out.println();
        }
    }





}