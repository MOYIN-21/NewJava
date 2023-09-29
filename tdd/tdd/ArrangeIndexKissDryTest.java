package tdd;

import org.junit.jupiter.api.Test;
import src.ArrangeIndexKissDry;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrangeIndexKissDryTest {
    @Test
    public void arrangeIndexOfKiss(){
        int[] numbers = {6,2,3,4,1,0,5};
        assertEquals("yssdikr", ArrangeIndexKissDry.kissDryIndex(numbers));
    }
}
