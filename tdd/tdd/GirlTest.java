package tdd;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import src.GirlChoice.Girl;
import src.GirlChoice.Laflare;
import src.GirlChoice.Tomide;
import src.GirlChoice.Victor;

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

