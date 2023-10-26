package FirstAndLastIndex;

import org.junit.jupiter.api.Test;
import serverClasses.ReturnFirstAndLastAndAllLetters;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReturnFirstAndLastAndAllLettersTest {
    @Test
    public void letters(){
        String actual =
                ReturnFirstAndLastAndAllLetters.firstLetter("Olawamide Moyinoluwa Tola");
        assertEquals("O.M. Tola", actual);
    }
}
