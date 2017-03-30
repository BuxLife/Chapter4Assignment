package com.buxlife.chapter4assignment.SRP;

import com.buxlife.chapter4assignment.Employee;

/**
 * Created by Bux_Life on 2017/03/30.
 */
public class HRService {
    public  boolean determineEmploymentStatus(Employee employee) {
        return employee.isEmployed();
    }
}
