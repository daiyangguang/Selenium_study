package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//@Test(enabled = false)表示不走当前的测试方法
public class IgnoreTest {
	String message = "Bolo";
	
	MessageUtil messageUtil = new MessageUtil(message);
	@Test(enabled = false)  
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
