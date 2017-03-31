package com.buxlife.chapter4assignment.OCP;

import com.buxlife.chapter4assignment.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Bux_Life on 2017/03/31.
 */
public class JobApplicationTest {
    @Test
    public void testApproveDevApplication() throws Exception {

        Employee emp1 = new Employee(2, "John", "Smith", "Male", 21, 4500.00, "Developer", "Software Developer with Skillz", 2500, true);
        JobApplication newApplication = new JobApplication();
        newApplication.approveDevApplication(emp1);
    }

}