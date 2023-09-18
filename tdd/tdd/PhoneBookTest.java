package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.PhoneBookContact.Directory;
import src.PhoneBookContact.PhoneBook;
import src.PhoneBookContact.PhoneBookList;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook;


    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook("userName","password");
        phoneBook.locked();
        assertTrue(phoneBook.isLocked());
    }

    @Test
    public void testThatPhoneBookIsUnLocked(){
        phoneBook.unLocked("password");
        assertFalse(phoneBook.isLocked());
    }

    @Test
    public void phoneBookCanBeLocked(){
        phoneBook.locked();
        assertTrue(phoneBook.isLocked());
    }


    @Test
    public void unLockedDiaryTest() {
        phoneBook.locked();
        Assertions.assertTrue(phoneBook.isLocked());
        phoneBook.unLocked("password");
        Assertions.assertFalse(phoneBook.isLocked());
    }
//    @Test
//    public void phoneBookCanBeCreatedTest(){
//        phoneBook.createPhoneBook("userName", "password");
//        assertEquals(new PhoneBookList(),phoneBook.);
////    }

    @Test
    public void directoryCanBeCreated(){
        phoneBook.locked();
        Assertions.assertTrue(phoneBook.isLocked());
        phoneBook.createDirectory(0, "name","address", "telephone","email");
        assertEquals(new Directory(0, "name", "address", "telephone","email").getDirectory(), phoneBook.findDirectory(0).getDirectory());
    }

    @Test
    public void directoryCanBeBeDeleted(){
        phoneBook.locked();
        Assertions.assertTrue(phoneBook.isLocked());
        phoneBook.createDirectory(1, "name","address", "telephone","email");
        assertEquals(new Directory(1, "name", "address", "telephone","email").getDirectory(), phoneBook.findDirectory(1).getDirectory());

        phoneBook.deleteDirectory(1);
        assertEquals(0, phoneBook.getSize());

    }
}
