package com.techreturners.exercise002;

public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private int age;

    /*
    Constructor of Person which initialises firstName, lastName, city
    and age
     */
    public Person(String firstName, String lastName, String city, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    //Returns the firstName of the person
    public String getFirstName() {
        return this.firstName;
    }

    //Returns the lastName of the person
    public String getLastName() {
        return this.lastName;
    }

    //Returns the city of the person
    public String getCity() {
        return this.city;
    }

    //Returns age of the person
    public int getAge() {
        return this.age;
    }
}
