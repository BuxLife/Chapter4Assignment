package com.buxlife.chapter4assignment.OCP;

import com.buxlife.chapter4assignment.Employee;
import com.buxlife.chapter4assignment.Person;

public class DeveloperApplication extends Application{

    @Override
    public Employee approveApplication(Person person) {

            Employee newEmployee = new Employee(01, person.getFirstName(), person.getLastName(), person.getGender(), person.getAge(), 4500.00, "Junior Developer", "Junior Front-End Developer", 2500, true);
            newEmployee.setEmployed(true);
            return newEmployee;
    }
}