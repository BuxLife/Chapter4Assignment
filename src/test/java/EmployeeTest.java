
import com.buxlife.chapter4assignment.Employee;
import com.buxlife.chapter4assignment.Person;
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
    public void testPolymorphism() throws Exception    {
        Employee emp1 = new Employee(02, "John", "Smith", "Male", 21, 4500.00);
        Person emp2 = new Employee(01,"John", "Doe", "Male", 22, 9000);
        System.out.println(emp2.toString());
    }
}