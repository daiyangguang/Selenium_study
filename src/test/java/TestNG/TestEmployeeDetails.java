package TestNG;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	//测试雇员的评估金额
	@Test
	public void testCalculateAppriasal() {
		employee.setName("Bolo");
		employee.setAge(26);
		employee.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		Assert.assertEquals(500.0, appraisal);
	}
	
	//测试雇员年薪
	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Bolo");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		
		assertEquals(96000.0, salary);
		
	}
}
