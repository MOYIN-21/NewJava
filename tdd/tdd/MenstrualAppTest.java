package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Menstrual;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest {
    Menstrual menstrual;

    public MenstrualAppTest() {
        menstrual = new Menstrual();
    }
    @Test
    public void testThatMenstrualPeriodCanBeChecked(){
        Date checkDate = new Date(2023 - 1900, 9, 15);
        Date calculate = menstrual.calculatePeriod(checkDate);
        Date result = new Date(2023 - 1900, 9, 29);
        assertEquals(result, calculate);
    }
    @Test
    public void testThatMenstrual_SafePeriodStarting_CanBeChecked(){
        Date checkDate = new Date(2023 - 1900, 9, 15);
        Date calculate = menstrual.findSafePeriodStart(checkDate);
        Date result = new Date(2023 - 1900, 9, 5);
        assertEquals(result, calculate);
    }
    @Test
    public void testThatMenstrual_SafePeriodEnding_CanBeChecked(){
        Date checkDate = new Date(2023 - 1900, 9, 15);
        Date calculate = menstrual.findSafePeriodEnd(checkDate);
        Date result = new Date(2023 - 1900, 9, 25);
        assertEquals(result, calculate);
        System.out.println(result);
    }
    @Test
    public void testThatMenstrual_Ovulation_CanBeChecked(){
        Date checkDate = new Date(2023 - 1900, 9, 25);
        Date calculate = menstrual.checkOvulation(checkDate);
        Date result = new Date(2023 - 1900, 10, 5);
        assertEquals(result, calculate);
    }
    @Test
    public void testThatMenstrual_FlowStart_CanBeCalculated(){
        Date checkDate = new Date(2023 - 1900, 9, 25);
        Date calculate = menstrual.findStartFlow(checkDate);
        Date result = new Date(2023 - 1900, 10, 22);
        assertEquals(result, calculate);
    }

}