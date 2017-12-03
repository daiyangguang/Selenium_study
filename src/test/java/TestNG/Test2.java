package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;
/**
 * 套件测试可以让我们通过运行testng.xml一次运行多个测试类 
 * @author Administrator
 *
 */
public class Test2 {
	String message = "Bolo";
	MessageUtil messageUtil = new MessageUtil(message);
	
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage");
		message = "hi" + message;
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
}
