package hackerRankTask;

import java.time.LocalDate;


public class CalenderClass {

        public static void main(String[] args) {
            System.out.println(findDay(9, 22, 2023));}

    private static String findDay(int month, int day, int year){
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
}
