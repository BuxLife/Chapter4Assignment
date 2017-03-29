
import com.buxlife.chapter4assignment.Employee;
import com.buxlife.chapter4assignment.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/29.
 */
public class EmployeeTest {
    @org.junit.Test
    public void calculateAnnum() throws Exception {
        Employee emp1 = new Employee(9, "John", "Smith", "Male", 21, 4500.00);
        assertEquals(54000.0, emp1.calculateAnnum(), 0.0f);
    }

    @Test
    public void testEncapsulation() throws Exception {
        Employee emp = new Employee(01,"John", "Doe", "Male", 22, 9000);
        System.out.println(emp.toString());

        emp.setFirstName("Hairy");
        emp.setLastName("Porter");
        emp.setGender("Female");
        emp.setAge(18);
        emp.setEmployeeID(99);
        emp.setSalary(12000);
        emp.setEmploymentStatus(true);
        System.out.println(emp.toString());

    }

    @Test
    public void testPolymorphism() throws Exception    {
        Person emp = new Employee(01,"John", "Doe", "Male", 22, 9000);

        Assert.assertTrue(emp instanceof  Person);
        Assert.assertTrue(emp instanceof  Employee);
        System.out.println(emp.toString());
    }
    @Test
    public void testInheritance() throws Exception{
        Employee emp1 = new Employee(02, "John", "Smith", "Male", 21, 4500.00);
        Person emp2 = new Employee(01,"John", "Doe", "Male", 22, 9000);

        System.out.println(emp1 instanceof Person);
        Assert.assertTrue(emp1 instanceof  Person);
        Assert.assertTrue(emp2 instanceof  Person);
        System.out.println(emp2 instanceof Person);

    }

}