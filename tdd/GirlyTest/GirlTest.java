package GirlyTest;

import org.junit.jupiter.api.Test;
import serverClasses.girlChoice.Girl;
import serverClasses.girlChoice.Laflare;
import serverClasses.girlChoice.Tomide;
import serverClasses.girlChoice.Victor;

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

