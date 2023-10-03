package MenstrualTest;

import org.junit.jupiter.api.Test;
import ServerClasses.MenstrualApp.Menstrual;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest {
    Menstrual menstrual;

    public MenstrualAppTest() {
        menstrual = new Menstrual();
    }
    Date checkDate = new Date(2023 - 1900, 10, 1);


    @Test
    public void testThatMenstrualPeriodCanBeChecked(){

        Date calculate = menstrual.calculatePeriod(checkDate);
        Date result = new Date(2023 - 1900, 9, 29);
        assertEquals(result, calculate);
    }
    @Test
    public void testThatMenstrual_SafePeriodStarting_CanBeChecked(){
        Date calculate = menstrual.findSafePeriodStart(checkDate);
        Date result = new Date(2023 - 1900, 9, 5);
        assertEquals(result, calculate);
        System.out.println(result);
    }
    @Test
    public void testThatMenstrual_SafePeriodEnding_CanBeChecked(){
        Date calculate = menstrual.findSafePeriodEnd(checkDate);
        Date result = new Date(2023 - 1900, 9, 25);
        assertEquals(result, calculate);
        System.out.println(result);
    }
    @Test
    public void testThatMenstrual_Ovulation_CanBeChecked(){
        Date calculate = menstrual.checkOvulation(checkDate);
        Date result = new Date(2023 - 1900, 10, 14);
        assertEquals(result, calculate);
    }
    @Test
    public void testThatMenstrual_FlowStart_CanBeCalculated(){
        Date calculate = menstrual.findStartFlow(checkDate);
        Date result = new Date(2023 - 1900, 10, 22);
        assertEquals(result, calculate);
    }

}