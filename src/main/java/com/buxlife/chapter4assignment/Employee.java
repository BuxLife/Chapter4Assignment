package com.buxlife.chapter4assignment;

public class Employee extends Person{

    private int employeeID;
    private double salary;  //Per Month.

    public Employee(String firstName, String lastName, String gender, int age, double salary)
    {
        super(firstName, lastName, gender, age);
        System.out.println("Constructor Initialized, Creating Employee.");
        setSalary(salary);
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double newSalary) {
        if(salary >= 0.00) {
            this.salary = newSalary;
        }
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateAnnum(){
        System.out.println("Employee:  " + getFirstName() + "\nSalary: R" + (salary *12) );
        return (salary *12);
    }
}