package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Menstrual;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest {
    @BeforeEach

    @Test
    public void userMenstrualAppIsLockedTest(){
        Menstrual menstrual = new Menstrual("0");
        menstrual.lockApp();
        assertTrue(menstrual.isLock());
    }

    @Test
    public void userMenstrualAppIsUnLockedTest(){
        Menstrual menstrual = new Menstrual("0");
        menstrual.lockApp();
        assertTrue(menstrual.isLock());
        menstrual.unLockApp("0");
        assertFalse(menstrual.isLock());
    }

    @Test
    public void nextPeriodDate(){
        Menstrual menstrual = new Menstrual("0");
        menstrual.lastPeriodDate();
        menstrual.cycleLength();
    }
}
