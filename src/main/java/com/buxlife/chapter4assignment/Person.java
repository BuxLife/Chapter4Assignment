package com.buxlife.chapter4assignment;

public class Person{

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    private boolean employmentStatus, gamerStatus;

    public Person(String firstName, String lastName, String gender, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmploymentStatus(boolean employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public void setGamerStatus(boolean gamerStatus) {
        this.gamerStatus = gamerStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public boolean isEmploymentStatus() {
        return employmentStatus;
    }

    public boolean isGamerStatus() {
        return gamerStatus;
    }
}