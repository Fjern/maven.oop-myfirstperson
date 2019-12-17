package com.github.curriculeon;

/**
 * Created by leon on 12/16/2019.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        this.setLastName("");
        this.setFirstName("");
    }

    public Person(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
}
