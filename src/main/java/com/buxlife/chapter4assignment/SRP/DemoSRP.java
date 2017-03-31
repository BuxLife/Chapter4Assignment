package com.buxlife.chapter4assignment.SRP;

import com.buxlife.chapter4assignment.Employee;

public class DemoSRP{

    public static void main(String[] args) {

        Employee person = new Employee(1, "John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);
        EmployeeServices es = new EmployeeServices();
        es.determineEmploymentStatus(person);
        es.updateSalary(person, 12000);

        /*The above code violates the SRP principle as class Employee Services
        * has more than one purpose/role
        * Below is valid implementation of SRP
        * */

        HRService hrService = new HRService();
        hrService.determineEmploymentStatus(person);

        FinanceService finance = new FinanceService();
        finance.updateSalary(person, 12000);

    }


}