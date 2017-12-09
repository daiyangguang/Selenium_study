package TestNG;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

//*****testNG运行JUnit测试
//优势： 可以使用TestNG执行  现有JUnit测试用例
// 有一定的兼容性
public class TestJunit {
	@Test
	public void testAdd() {
		String  str = "Junit testing using TestNG";
		assertEquals("Junit testing using TestNG", str);
	
	}
}
