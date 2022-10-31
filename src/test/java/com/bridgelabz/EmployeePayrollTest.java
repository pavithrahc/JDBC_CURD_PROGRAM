package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmployeePayrollTest {

    @Test
    public void givenEmpPayrollInDB_WhenRetrieved_ShouldMatchEmployeeCount() {
        EmployeePayroll employeePayroll = new EmployeePayroll();
        List<EmployeePayrollData> employeePayrollData = employeePayroll.readEmployeePayrollData();
        Assert.assertEquals(3, employeePayrollData.size());

    }

}

