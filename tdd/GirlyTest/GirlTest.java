package GirlyTest;

import org.junit.jupiter.api.Test;
import ServerClasses.girlChoice.Girl;
import ServerClasses.girlChoice.Laflare;
import ServerClasses.girlChoice.Tomide;
import ServerClasses.girlChoice.Victor;

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

