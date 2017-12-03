package TestNG;

/**
 * 业务逻辑类
 * @author Administrator
 *
 */
public class EmpBusinessLogic {
	//计算员工每年的薪水
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}
	//考核支付与雇员的money
	public double calculateAppraisal(EmployeeDetails employee) {
		double appraisal = 0;
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		}
		else {
			appraisal = 1000;
		}
		return appraisal;
	}

}
