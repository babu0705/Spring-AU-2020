package EmployeeExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
EmployeeDetails employee=new EmployeeDetails();
EmployeeBusinessLogic empBusinessLogic=new EmployeeBusinessLogic();
	@Test
	public void testCalculateAppraisal() {
		employee.setName("babu");
		employee.setAge(22);
		employee.setMonthlySalary(20000);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(1000.00, appraisal,0.0);
	}
	
	@Test
	public void testcalculateYearlySalary() {
		employee.setName("babu");
		employee.setAge(22);
		employee.setMonthlySalary(10000);
		double yrsalary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(121001.00, yrsalary,1000.0);
	}
	
}
