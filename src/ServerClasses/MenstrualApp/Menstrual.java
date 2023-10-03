package ServerClasses.MenstrualApp;

import java.util.Date;
import java.util.InputMismatchException;

public class Menstrual {
    public Date findSafePeriodStart(Date checkDate) {
        long checkStart = checkDate.getTime() - (10 * 24 * 60 * 60 * 1000L);
        return new Date(checkStart);
    }

    public Date calculatePeriod(Date checkDate) {
        long checkPeriod = checkDate.getTime() + (14 * 24 * 60 * 60 * 1000L);
        return new Date(checkPeriod);
    }


    public Date findSafePeriodEnd(Date checkDate) {
        long checkEnd = checkDate.getTime() + (10 * 24 * 60 * 60 * 1000L);
        return new Date(checkEnd);
    }

    public Date checkOvulation(Date cycleLength) {
        if (cycleLength.getTime() < 0) {
            throw new InputMismatchException("Date does not align");
        } else {
            long checkOvulation = cycleLength.getTime() + (13 * 24 * 60 * 60 * 1000L);
            return new Date(checkOvulation);
        }
    }

    public Date findStartFlow(Date checkFlow) {
        long checkEnd = checkFlow.getTime() + (28 * 24 * 60 * 60 * 1000L);
        return new Date(checkEnd);
    }

    public Date findEndFlow(Date checkFlow) {
        long checkEnd = checkFlow.getTime() + (28  * 24 * 60 * 60 * 1000L);
        return new Date(checkEnd);
    }
}



