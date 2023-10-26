package serverClasses.Phone_BookApp;


import java.util.ArrayList;
import java.util.List;

public class Phone_Book {

    private final List<Contact> phoneBooks = new ArrayList<>();

    public void createContact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        Contact contacts = new Contact(firstName, lastName, phoneNumber, emailAddress);
        phoneBooks.add(contacts);
    }

    public int countContact() {
        return phoneBooks.size();
    }

    public Contact viewContact(String name) {
        for (Contact contacts : phoneBooks) {
            if (Contact.getContactName().equals(name))
                return contacts;
        }
        throw new IllegalArgumentException("name not found");
    }

    public boolean deleteContact(String name) {
        for (Contact each : phoneBooks) {
            if (Contact.getContactName().equals(name))
                return phoneBooks.remove(each);

        }
        return false;
    }

    public int viewAllContact() {
        int count = 0;
        for (int each = 0; each <= phoneBooks.size(); each++) {
            count += each;
        }
        return count;
    }

//    public int editContact(String initialName, String firstName, String lastName, String phoneNumber, String emailAddress) {
//        for (Contact contacts : phoneBooks) {
//            if (initialName == contacts.getContactName()) {
//                contacts.setContactName(firstName + " " + lastName);
//                contacts.setPhoneNumber(phoneNumber);
//                contacts.setEmailAddress(emailAddress);
//                contacts.
//
//
//                throw new IllegalArgumentException("):");
//            }
//            return 0;


}
