package classChinChin;

import java.util.Scanner;

import static classChinChin.Geographical.*;
import static java.lang.System.in;

public class GeographicalState {
    public static void main(String[] args) {
        GeographicalState entry = new GeographicalState();
        entry();
    }

    private static void entry() {
        Scanner scanner = new Scanner(in);
        System.out.println("Enter any State: ");
        String keyboard = scanner.nextLine();
        if (keyboard.matches("^\\D+$*")) {
            Geographical isPolitical = geopolitical(keyboard);
            if (isPolitical == NORTH_CENTRAL)
                System.out.print("NORTH CENTRAL");
            else if (isPolitical == NORTH_EAST)
                System.out.print("NORTH EAST");
            else if (isPolitical == NORTH_WEST)
                System.out.print("NORTH WEST");
            else if (isPolitical == SOUTH_SOUTH)
                System.out.print("SOUTH SOUTH");
            else if (isPolitical == SOUTH_WEST)
                System.out.print("SOUTH WEST");
            else if (isPolitical == SOUTH_EAST)
                System.out.printf("SOUTH EAST");
            else {
                System.out.printf("Not a State");
                entry();
            }
        }
    }
}

