package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestHelloWorld {
  @Test
  public void f() {
	  RandomEmailGenerator obj = new RandomEmailGenerator();
	  String email = obj.generator();
//	  System.out.println(email);
	  Assert.assertNotNull(email);
	  Assert.assertEquals(email, "daiyangguang7@163.com");
  }
}
