package src.phoneBookContact;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookList {
    private static final List<PhoneBook> phoneBookList = new ArrayList<>();

    public static PhoneBook findByUserName(String userName) {
        for(PhoneBook phoneBook: phoneBookList){
            if (phoneBook.getUserName().equals(userName))
                return phoneBook;
        }
        throw new IllegalArgumentException("Username not found");
    }

    public void addUser(String userName, String password){
        PhoneBook diary = new PhoneBook(userName, password);
        phoneBookList.add(diary);
    }

    public void delete(String userName, String password){
        PhoneBook phoneBook = new PhoneBook(userName, password);
        phoneBookList.remove(phoneBook);
    }
}
