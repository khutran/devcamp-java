package com.devcamp.music.model;

public class Person {
    private String firstname;
    private String lastname;

    public Person() {
    }

    public Person(String fn, String ln) {
        this.firstname = fn;
        this.lastname = ln;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
