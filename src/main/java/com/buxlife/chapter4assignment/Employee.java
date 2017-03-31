package com.buxlife.chapter4assignment;

public class Employee extends Person {

    private int employeeID;
    private double salary;  //Per Month.
    private final Duty job;

    public Employee(int id, String firstName, String lastName, String gender, int age, double salary, String position, String description, double bonus, boolean leader) {
        super(firstName, lastName, gender, age);
        job = new Duty(position, description, bonus, leader);
        setSalary(salary);
        setEmployeeID(id);
        super.setEmployed(true);

    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double newSalary) {
        if (salary >= 0.00) {
            this.salary = newSalary;
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateAnnum() {
        System.out.println("Employee:  " + super.getFirstName() + "\nSalary: R" + (salary * 12));
        return (salary * 12);
    }

    public String toString() {
        return ("Employee Details: \nFirst Name: \t" + getFirstName() + "\nLast Name: \t\t" + getLastName() + "\nGender: \t\t" + getGender() + "\nAge: \t\t\t" + getAge());
    }

    public String getJobDetails() {
        String pos = "";
        if (job.isLeader()) {
            pos = pos + "Leader";
        } else {
            pos = pos + "Member";
        }
        return "\nJob Description:\n********************\nPosition: \t\t\t" + job.getPosition() + "\nJob Description: \t" + job.getDescription() + "\nBonus: \t\t\t\t"  + job.getBonus() + "\nAuthority: \t\t\t" + pos;

    }

    @Override
    public boolean isEmployed() {
        return super.isEmployed();
    }
}