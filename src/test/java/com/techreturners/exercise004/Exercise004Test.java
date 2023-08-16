package com.techreturners.exercise004;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    /*
    This method asserts that null is returned when LocalDateTime
    object is null that is no date for gigaSecond addition
     */
    @Test
    public void checkGetDateTimeWhenDateObjectIsNull() {
        Exercise004 ex004 = new Exercise004((LocalDateTime) null);
        assertNull(ex004.getDateTime());
    }

    /*
    This method checks gigaSecond addition when dateTime is in
    future
     */
    @Test
    public void checkGetDDateTimeWhenBothDateAndTimeInFuture() {
        Exercise004 ex004 = new Exercise004(LocalDateTime.of(3000,12,31,23,59, 59));
        LocalDateTime expected = LocalDateTime.of(3032,9,9,1,46,39);
        assertEquals(expected,ex004.getDateTime());
    }

    /*
    This method checks gigaSecond addition when dateTime is in
    future with year spilling to five digits
     */
    @Test
    public void checkGetDDateTimeWhenBothDateAndTimeInFutureYearInFiveDigits() {
        Exercise004 ex004 = new Exercise004(LocalDateTime.of(9999,12,31,23,59, 59));
        LocalDateTime expected = LocalDateTime.of(10031,9,9,1,46,39);
        assertEquals(expected,ex004.getDateTime());
    }

    /*
    This method checks gigaSecond addition when dateTime is just
    about to be year 2000
     */
    @Test
    public void checkWhenLocalDatetimeIsJustBeforeMillennium(){
        LocalDateTime localDateTime = LocalDateTime.of(1999,12,31,23,59,59,59);
        Exercise004 ex004 = new Exercise004(localDateTime);
        LocalDateTime expected = LocalDateTime.of(2031,9,9,1,46,39,59);
        assertEquals(expected,ex004.getDateTime());
    }
}
