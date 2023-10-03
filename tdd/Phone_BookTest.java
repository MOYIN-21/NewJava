import ServerClasses.Phone_Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Phone_BookTest {
    public Phone_Book phone_Book;

    @BeforeEach
    public void startWith() {
        phone_Book = new Phone_Book();
        phone_Book.createContact("Moyin", "Ola", "09026112098", "Ola@gmail.com");
    }

    @Test
    public void phoneBookCanBeCreatedTest() {
        assertNotNull(phone_Book);
    }

    @Test
    public void phoneBookCanCreateContactTest() {
        phone_Book.createContact("Moyin", "Ola", "09026112098", "Ola@gmail.com");
        assertEquals(2, phone_Book.countContact());
    }

    @Test
    public void contactCanBeViewedTest() {
        phone_Book.createContact("Moyin", "Ola", "09026112098", "Ola@gmail.com");
        String expected = """
                Contact Name: Moyin Ola
                Contact Phone Number: 09026112098
                Contact Email_Address: Ola@gmail.com""";
        assertEquals(expected, phone_Book.viewContact("Moyin Ola"));
    }

//    @Test
//    public void contactCanBeEditedTest(){
//        phone_Book.editContact("Moyin Ola","Ola","mide", "070", "ple");
//        String expected = """
//                Contact Name: Ola mide
//                       Contact Phone Number: 070
//                       Contact Email-Address: ple
//                        """;
//        assertEquals(expected, phone_Book.viewContact("Ola mide"));
//}

    @Test
    public void contactCanBeDeleted(){
        phone_Book.createContact("Moy", "Ola","09026112098", "Ola@gmail.com");
        phone_Book.deleteContact("Moyin Ola");
        assertEquals(1,phone_Book.countContact());
    }
}
