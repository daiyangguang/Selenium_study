package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

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
