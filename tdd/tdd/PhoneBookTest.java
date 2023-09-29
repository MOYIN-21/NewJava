package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.phoneBookContact.Directory;
import src.phoneBookContact.PhoneBook;

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
        assertFalse(phoneBook.isLocked());
    }
    @Test
    public void phoneBookCanBeCreatedTest(){
        assertNotNull(phoneBook);
    }

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
        phoneBook.createDirectory(2,"names","addresses", "telephones", "emails");

        assertEquals(new Directory(1, "name", "address", "telephone","email").getDirectory(), phoneBook.findDirectory(1).getDirectory());
        assertEquals(new Directory(2,"names","addresses","telephones","emails").getDirectory(),phoneBook.findDirectory(2).getDirectory());


        phoneBook.deleteDirectory(1);
        assertEquals(1, phoneBook.getSize());

    }
}
