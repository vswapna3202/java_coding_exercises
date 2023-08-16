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

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }


    public void setCity(String city){
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
