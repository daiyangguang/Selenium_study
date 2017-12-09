package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParamTestWithDataProvider1 {
	private PrimeNumberChecker primeNumberChecker;
	@BeforeMethod
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}
	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] {
			{2,true}, {6,false}, {19, true}, {22, false}, {23,true}
		};
	}
	@Test(dataProvider = "test1")
	//判断输入的数字是否都是素数。
	public void testPrimeNumberChecker(Integer inputNumber, Boolean exceptedResult) {
		//打印测试数据
		System.out.println(inputNumber + " " + exceptedResult);
		//断言判定时候均是正确的
		Assert.assertEquals(exceptedResult, primeNumberChecker.validate(inputNumber));
	}
	
	
	
	
	
}
