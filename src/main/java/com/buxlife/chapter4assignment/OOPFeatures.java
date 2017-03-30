package com.buxlife.chapter4assignment;

/**
 * Created by Bux_Life on 2017/03/30.
 */
class OOPFeatures {
    public static void polymorphism(){
        Person emp = new Employee(1,"John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);
        System.out.println("An Example of Polymorphism. EMPLOYEE-IS A-PERSON");
        System.out.println("Employee " + emp.getLastName() + emp.getFirstName() + "is an instance of Class Person = " + (emp instanceof Person));
        System.out.println(emp.toString());

    }
    public static void inheritance(){
        Employee emp1 = new Employee(2, "John", "Smith", "Male", 21, 4500.00, "Developer", "Software Developer with Skillz", 2500, true);
        Person emp2 = new Employee(1,"John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);

        //.getLastName() and getFirstName() are methods created within the parent class. Inherited by subClasses emp1 and emp2.

        System.out.println("Employee " + emp1.getLastName() + emp1.getFirstName() + "is an instance of Person = " + (emp1 instanceof Person));
        System.out.println("Employee " + emp2.getLastName() + emp2.getFirstName() + "is an instance of Person = " + (emp2 instanceof Person));


    }
    public static void composition(){
        //An alternative to concrete inheritance(using the extends keyword)
        System.out.println("Demonstrates the HAS - A relationship type. Employee HAS-A Duty");
        Employee emp1 = new Employee(2, "Naeem", "Bux", "Male", 24, 100000, "Developer", "Software Developer with mad skillz", 99999, true);
        System.out.println(emp1.toString());
        System.out.println(emp1.getJobDetails());

        Employee emp2 = new Employee(4, "Jane", "Dee", "Female", 24, 1000, "Receptionist", "Sit around, write things down, answer calls.", 100, false);
        System.out.println(emp2.toString());
        System.out.println(emp2.getJobDetails());
    }
    public static void encapsulation(){
        Employee emp = new Employee(1,"John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);
        System.out.println(emp.toString());

        emp.setFirstName("Hairy");
        emp.setLastName("Porter");
        emp.setGender("Female");
        emp.setAge(18);
        emp.setEmployeeID(99);
        emp.setSalary(12000);
        System.out.println(emp.toString());
        System.out.println("ID: \t\t\t\t" + emp.getEmployeeID());
        System.out.println("Salary: \t\t" + emp.getSalary());

    }
}
