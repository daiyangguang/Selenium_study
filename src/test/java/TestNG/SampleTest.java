package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SampleTest {
	
	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		Assert.assertEquals(message, messageUtil.printMessage());
	}
}
