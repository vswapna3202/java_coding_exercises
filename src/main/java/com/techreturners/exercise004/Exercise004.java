package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private final LocalDateTime dateTime;

    //Constructor with LocalDate object
    public Exercise004(LocalDate date) {
        // If only date is entered then add time as startOfDay,
        //so we now have a dateTime object
        this.dateTime = date != null ?  date.atStartOfDay() :  null;
    }

    //Constructor with LocalDateTime object
    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    //getDateTime method returns dateTime object which has added 10^9 second
    //or a giga second
    public LocalDateTime getDateTime() {
        return (this.dateTime != null) ? this.dateTime.plusSeconds(1000000000L) : null;

    }
}
