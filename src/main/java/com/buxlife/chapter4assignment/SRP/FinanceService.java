package com.buxlife.chapter4assignment.SRP;

import com.buxlife.chapter4assignment.Employee;

/**
 * Created by Bux_Life on 2017/03/30.
 */
public class FinanceService {
    public void updateSalary(Employee employee, double salary) {
            employee.setSalary(salary);
    }
}
