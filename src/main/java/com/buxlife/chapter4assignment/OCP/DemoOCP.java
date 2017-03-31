package com.buxlife.chapter4assignment.OCP;

import com.buxlife.chapter4assignment.Employee;

public class DemoOCP{

    public static void main(String[] args)
    {
        Employee person = new Employee(1, "John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);

        /*This code violates the OCP principle/

        JobApplication application =  new JobApplication();
        application.approveApplication(person);
        *****************************************/

        //OCP Valid implementation
        DeveloperApplication applicationDev = new DeveloperApplication();
        HumanResourcesApplication applicationHR = new HumanResourcesApplication();

        applicationDev.approveApplication(person);
        applicationHR.approveApplication(person);

    }

}