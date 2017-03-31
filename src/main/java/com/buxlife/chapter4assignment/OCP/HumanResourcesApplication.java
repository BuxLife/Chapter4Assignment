package com.buxlife.chapter4assignment.OCP;

import com.buxlife.chapter4assignment.Employee;
import com.buxlife.chapter4assignment.Person;

public class HumanResourcesApplication extends Application{

    @Override
    public Employee approveApplication(Person person) {
        Employee newEmployee = new Employee(21, person.getFirstName(), person.getLastName(), person.getGender(), person.getAge(), 2500.00, "Human Resources Assistant", "HR Junior Assistant", 500, true);
        newEmployee.setEmployed(true);
        return newEmployee;
    }
}