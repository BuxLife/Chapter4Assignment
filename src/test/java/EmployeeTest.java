
import com.buxlife.chapter4assignment.Employee;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/29.
 */
public class EmployeeTest {
    @org.junit.Test
    public void calculateAnnum() throws Exception {
        Employee emp1 = new Employee("John", "Smith", "Male", 21, 4500.00);
        assertEquals(54000.0, emp1.calculateAnnum(), 0.0f);
    }

    public void testClass() throws Exception    {

    }
}