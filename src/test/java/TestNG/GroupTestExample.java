package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
/**
 *  组的测试方法两个类别为：
       检入登记测试（checkintest）：提交新的代码之前，你应该运行这些测试。他们通常应快，只要确保没有被打破的基本功能。
       功能测试（functest）：这些测试应该涵盖软件的所有功能，每天至少运行一次，虽然理想情况下，会希望他们不断运行。
 * @author Administrator
 *
 */
public class GroupTestExample {
	String message = ".com";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(groups = {"functest","checkintest"})
	public void testPrintMessage() {
		System.out.println("Insise testPrintMessage()");
		message = ".com";
		Assert.assertEquals(message, messageUtil.printMessage());
	}
	@Test(groups = "checkintest")
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "tutorialspoit" + ".com";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
	@Test(groups = "functest")
	public void testingExitMessage() {
		System.out.println("Inside testExitMessage");
		message = "www" + "tutorialspoit" + ".com";
		Assert.assertEquals(message, messageUtil.exitMessage());
	}
}
