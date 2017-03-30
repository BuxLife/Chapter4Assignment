
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


    //Composition is an alternative to inheritance
}