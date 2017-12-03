package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {
	String message = "Bolo";
	
	MessageUtil messageUtil = new MessageUtil(message);
	@Test(enabled = false)  //表示不走当前的测试方法
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Bolo";
		Assert.assertEquals(message, messageUtil.printMessage());
		
	}
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "hi" + message;
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
	
}
