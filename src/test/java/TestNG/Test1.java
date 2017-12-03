package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//创建一个测试用例类
public class Test1 {
	String message = "bolo";
	MessageUtil messageUtil = new MessageUtil(message);
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage");
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
