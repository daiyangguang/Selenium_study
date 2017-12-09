package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyTestUsingAnnotation {
	String message = "Bolo";
	MessageUtil messageUtil = new  MessageUtil(message);
	
//	@Test
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage");
		message = "Bolo";
		Assert.assertEquals(message, messageUtil.printMessage());
	}
	
//	@Test(dependsOnMethods = {"initEnvironmentTest"})
	@Test(dependsOnGroups = { "init.*" })
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage");
		message = "hi" + message;
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}
//	@Test
	@Test(groups = { "init" })
	public void initEnvironmentTest() {
		System.out.println("This is initEnvironmentTest");
	}
	
	/**
	 * ① 结果为什么是这个？ 为什么会失败啊？(断言导致的报错，预期值跟实际值不一致而已)
	 * This is initEnvironmentTest
		Inside testPrintMessage
		Bolo
		Inside testSalutationMessage
		hiBolo
	 * 
	 */
	
	/**
	 * ② testSalutationMessage（）被声明为根据任何一组匹配正则表达式“的init*”，
	 * 这保证了，一种方法，testPrintMessage的（）和initEnvironmentTest（）
	 * 将始终在testSalutationMessage（）前被调用。
	 * 
	 * 如果一个方法失败，取决于你有一个很难依赖于它（alwaysRun= false，这是默认的），
	 * 没有标记的方法依赖于它的失败，但作为跳过。
	 * 跳过的方法将被报告为例如在最终报告（在HTML中，既不是红也不是绿的颜色），
	 * 这是很重要的，因为跳过的方法不一定是失败。
	 */
}
