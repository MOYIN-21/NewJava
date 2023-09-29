package tdd;

import org.junit.jupiter.api.Test;
import src.girlChoice.Girl;
import src.girlChoice.Laflare;
import src.girlChoice.Tomide;
import src.girlChoice.Victor;

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

