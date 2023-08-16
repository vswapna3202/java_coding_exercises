package com.techreturners.exercise002;

public class Exercise002 {

    /*
    This method checks if the Person passed to this method is from
    city Machester or not by invoking getCity() method on person
     */
    public boolean isFromManchester(Person person) {
        if (person.getCity().equals("Manchester"))
            return true;
        else
            return false;
    }

    /*
    This method checks if Person can watch a film depending on his age.
    If age is >= ageLimit return True else return false
     */
    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.getAge() >= ageLimit)
            return true;
        else
            return false;
    }
    
}
