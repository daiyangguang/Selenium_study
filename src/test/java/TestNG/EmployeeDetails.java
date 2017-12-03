package TestNG;

//http://www.yiibai.com/html/testng/2013/0914294.html
//TestNG编写测试
/**
 * get/set员工的名字、薪水、年龄
 */
 
public class EmployeeDetails {
	private String name;
	private double monthlySalary;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
