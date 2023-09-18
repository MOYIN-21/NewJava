package src.PhoneBookContact;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookList {
    private static List<PhoneBook> phoneBookList = new ArrayList<>();

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

}
