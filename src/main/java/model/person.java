package model;
//Java Bean

//1. implements Serializable
//2. no arg constructor
//3. private member with get and set

import java.io.Serializable;

public class person implements Serializable {

    private String firstName;
    private String lastName;
    private int age;

    public person() {
        this.firstName = "Bob";
        this.lastName = "Ross";
        this.age = 45;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
