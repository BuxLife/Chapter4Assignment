package com.buxlife.chapter4assignment.OCP;

import com.buxlife.chapter4assignment.Employee;
import com.buxlife.chapter4assignment.Person;

//THIS CODE VIOLATES OCP PRINCIPLE

class JobApplication{

    public void approveApplication(Person person)
    {
        if (person.isEmployed() == false)
        {
            Employee newEmployee = new Employee(01, person.getFirstName(), person.getLastName(), person.getGender(), person.getAge(), 4500.00, "Junior Developer", "Junior Front-End Developer", 2500, true);
            newEmployee.setEmployed(true);
        }
    }

    public void approveDevApplication(Person person)
    {
        if (person.isEmployed() == false)
        {
            Employee newEmployee = new Employee(01, person.getFirstName(), person.getLastName(), person.getGender(), person.getAge(), 4500.00, "Junior Developer", "Junior Front-End Developer", 2500, true);
            newEmployee.setEmployed(true);
        }
    }

    public void approveHRApplication(Person person)
    {
        if (person.isEmployed() == false)
        {
            Employee newEmployee = new Employee(21, person.getFirstName(), person.getLastName(), person.getGender(), person.getAge(), 2500.00, "Human Resources Assistant", "HR Junior Assistant", 500, true);
            newEmployee.setEmployed(true);
        }
    }

}