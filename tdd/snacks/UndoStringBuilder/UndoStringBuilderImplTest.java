package snacks.UndoStringBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class UndoStringBuilderImplTest {
    UndoStringBuilderImpl usb;

    @BeforeEach
    public void startWith() {
        usb = new UndoStringBuilderImpl("to be or not to be");
    }

    @Test
    public void testThatStringBuilderCanAppend() {

        usb.append(" wicked");
        String expected ="to be or not to be wicked";

        String actual =  usb.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testThatStringBuilderCanReplace(){
        usb.replace(3, 5, "eat");
        String actual = usb.toString();

        String expected = "to eat or not to be";
        assertEquals(expected, actual);
    }
    @Test
    public void testThatStringBuilderCanReverse() {
           usb.reverse();
            String actual = usb.toString();

            String expected = "eb ot ton ro eb ot";
            assertEquals(expected, actual);
    }

    @Test
    public void testThatStringBuilderCanDelete(){
        usb.delete(2,4);
        String actual = usb.toString();

        String expected = "toe or not to be";
        assertEquals(expected, actual);
    }

    @Test
    public void testInsertMethod(){

        usb.insert(1, " ");
        String actual = usb.toString();

        String expected = "t o be or not to be";
        assertEquals(expected, actual);
    }

    @Test
    public void testThatStringBuilderCanUndo(){
        usb.undo();
        String actual = usb.toString();

        String expected = "to be or not to be";
        assertEquals(expected, actual);
    }

    @Test
    public void testAllMethodsAndUndo(){
       UndoStringBuilderImpl usb = new UndoStringBuilderImpl();

        usb.append("to be or not to be");
        assertEquals("to be or not to be", usb.toString());
        usb.replace(3, 5, "eat");
        assertEquals("to eat or not to be", usb.toString());
        usb.replace(17, 19, "eat");
        assertEquals("to eat or not to eat", usb.toString());
        usb.reverse();
        assertEquals("tae ot ton ro tae ot", usb.toString());



        usb.undo();
        assertEquals("to eat or not to eat",usb.toString());
        usb.undo();
        assertEquals("to eat or not to be",usb.toString());
        usb.undo();
        assertEquals("to be or not to be",usb.toString());
    }
}