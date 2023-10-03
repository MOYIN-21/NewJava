package ServerClasses;


import ServerClasses.Phone_BookApp.contact;

import java.util.ArrayList;
import java.util.List;

public class Phone_Book {

    private final List<contact> phoneBooks = new ArrayList<>();

    public void createContact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        contact contacts = new contact(firstName, lastName,phoneNumber, emailAddress);
        phoneBooks.add(contacts);
    }

    public int countContact() {
        return phoneBooks.size();
    }

    public contact viewContact(String name) {
        for (contact contacts: phoneBooks) {
            if (contact.getContactName().equals(name))
                return contacts;
            }
        throw new IllegalArgumentException("name not found");
    }

    public boolean deleteContact(String name) {
        for (contact each : phoneBooks) {
            if (contact.getContactName().equals(name))
                return phoneBooks.remove(each);

        }
        return false;
    }

    public int viewAllContact() {
        for (int each = 0; each <= phoneBooks.size(); each++) {
            return each;
        }

//    public void editContact(String initialName, String firstName, String lastName, String phoneNumber, String emailAddress) {
//        for (contact contacts: phoneBooks.size()) {
//            if (initialName == phoneBooks[contacts].getContactName()) {
//                contacts[contact].setContactName(firstName + " " + lastName);
//                contacts[contact].setPhoneNumber(phoneNumber);
//                contacts[contact].setEmailAddress(emailAddress);
//                contacts.


        throw new IllegalArgumentException("):");
    }
}
