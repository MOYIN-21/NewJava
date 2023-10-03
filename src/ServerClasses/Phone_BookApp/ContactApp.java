package ServerClasses.Phone_BookApp;


import static ServerClasses.bankAccountApp.BankApp.display;
import static ServerClasses.bankAccountApp.BankApp.input;

public class ContactApp {
    public static final
    contact eagle = new contact("Moyin", "Ola", "09026112098", "Ola@gmail.com");
    private static void goToMenu(){
        String mainMenu = input("""
                               ===================================
                                So good to be here, How are you today?
                                1 -> Create Contact
                                2 -> View Contact
                                3 -> Edit Contact
                                4 -> Count Contact
                                5 -> Delete Contact
                                6 -> View All Contact
                                7 -> Exit"
                               ===================================
                                """);
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case 1:
                createContact();

            case 2:
                viewContact();

            case 3:
                editContact();

            case 4:
                countContact();

            case 5:
                deleteContact();

            case 6:
                viewAllContact();

            case 7:
                exit();

            default:
                System.exit(1);
        }

    }

    private static void exit() {
        display("Thank you for using our application");
        System.exit(0);
    }

    private static void viewAllContact() {
//        eagle.view_all_contact();
        goToMenu();
    }

    private static void deleteContact() {
        String first_name = input("Enter First Name");
        String last_name = input("Enter First Name");
//        eagle.delete_contact();
        display("Contact deleted successfully");
        goToMenu();
    }

    private static void countContact() {
//        String numberOfContacts = eagle.countContact();
//        String message = "You have" + " " + numberOfContacts + " " + "numbers of Contacts in your phonebook";
//        display( message);
        goToMenu();

    }

    private static void editContact() {
        String initial_first_name = input("Enter Initial First Name");
        String initial_last_name = input("Enter Initial last Name");
        String first_name = input("Enter First Name");
        String last_name = input("Enter First Name");
        String phone_number = input("Enter Phone Number");
        String email_address = input("Enter Email Address");
//        eagle.edit_contact(initial_first_name + " " + initial_last_name, first_name,
//                last_name, phone_number, email_address);
        display("Contact Updated");
        goToMenu();

    }

    private static void viewContact() {
        String firstName = input("Enter First Name");
        String last_name = input("Enter First Name");
        display("Hi, here is your entry");
//        eagle.viewContact();
        goToMenu();
    }

    private static void createContact() {
        String userName = input("Enter First Name");
        String lastName = input("Enter Last Name");
        String number = input("Enter Phone Number");
        String address = input("Enter Email Address");
        display("Hi," + " " + userName + lastName + " " + "Your contact has been created successfully");
//        eagle.createContact();
        goToMenu();
    }
}
