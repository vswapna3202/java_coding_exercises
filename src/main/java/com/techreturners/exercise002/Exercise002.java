package com.techreturners.exercise002;

public class Exercise002 {

    /*
    This method checks if the Person passed to this method is from
    city Manchester or not by invoking getCity() method on person
     */
    public boolean isFromManchester(Person person) {
        return person.getCity().equals("Manchester");
    }

    /*
    This method checks if Person can watch a film depending on his age.
    If age is >= ageLimit return True else return false
     */
    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge() >= ageLimit;
    }
    
}
