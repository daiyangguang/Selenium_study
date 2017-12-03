package TestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;
//@Listeners
public class TestAnnotation {
	//注释方法将在每个测试方法之前运行。
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void afterMethond() {
		System.out.println("@AfterMethond");
	}
	@Test
	public void test() {
		System.out.println("@Test----first");
	}
	@Test
	public void test001() {
		System.out.println("@Test------second");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	
	}
}
