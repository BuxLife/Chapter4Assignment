
import com.buxlife.chapter4assignment.Employee;
import com.buxlife.chapter4assignment.Person;
import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/29.
 */
public class EmployeeTest {


    @Test
    public void calculateAnnum() throws Exception {
        Employee emp1 = new Employee(9, "John", "Smith", "Male", 21, 4500.00, "Developer", "Software Developer", 2500, true);
        assertEquals(54000.0, emp1.calculateAnnum(), 0.0f);
    }

    @Test
    public void testEncapsulation() throws Exception {
        Employee emp = new Employee(01,"John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);
        System.out.println(emp.toString());

        emp.setFirstName("Hairy");
        emp.setLastName("Porter");
        emp.setGender("Female");
        emp.setAge(18);
        emp.setEmployeeID(99);
        emp.setSalary(12000);
        emp.setEmploymentStatus(true);
        System.out.println(emp.toString());
        System.out.println("ID: \t\t\t\t" + emp.getEmployeeID());
        System.out.println("Salary: \t\t" + emp.getSalary());
    }

    @Test
    public void testPolymorphism() throws Exception    {
        Person emp = new Employee(01,"John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);

        Assert.assertTrue(emp instanceof  Person);
        Assert.assertTrue(emp instanceof  Employee);
        System.out.println(emp.toString());
    }

    @Test
    public void testInheritance() throws Exception{
        Employee emp1 = new Employee(02, "John", "Smith", "Male", 21, 4500.00, "Developer", "Software Developer with Skillz", 2500, true);
        Person emp2 = new Employee(01,"John", "Doe", "Male", 22, 9000, "Developer", "Software Developer", 2500, true);

        System.out.println(emp1 instanceof Person);
        Assert.assertTrue(emp1 instanceof  Person);
        Assert.assertTrue(emp2 instanceof  Person);
        System.out.println(emp2 instanceof Person);

        if (emp1 instanceof Person)
        {
            System.out.println("Employee 1 is a sub-class of Person");
        }
        if (emp2 instanceof Person) {
            System.out.println("Employee 2 is a sub-class of Person");
        }
    }

    @Test
    public void testComposition() throws Exception{
        //This test just demonstrates that object of Class Person, implements a HAS - A relationship, with object of Class Duty

        Employee emp1 = new Employee(02, "Naeem", "Bux", "Male", 24, 100000, "Developer", "Software Developer with mad skillz", 99999, true);
        System.out.println(emp1.toString());
        System.out.println(emp1.getJobDetails());

        Employee emp2 = new Employee(04, "Jane", "Dee", "Female", 24, 1000, "Receptionist", "Sit around, write things down, answer calls.", 100, false);
        System.out.println(emp2.toString());
        System.out.println(emp2.getJobDetails());
    }

}