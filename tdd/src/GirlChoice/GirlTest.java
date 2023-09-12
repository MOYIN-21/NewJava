package src.GirlChoice;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class GirlTest {
    @Test
    public void girlCanGetFreshTest(){
        Girl esther = new Girl(new Laflare());
        esther.spend();

        Girl mofe = new Girl(new Tomide());
        mofe.spend();

        Girl dupe = new Girl(new Victor());
        dupe.spend();
    }
}

