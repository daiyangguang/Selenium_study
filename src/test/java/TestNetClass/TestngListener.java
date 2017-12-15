package dada;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
//https://www.ibm.com/developerworks/cn/opensource/os-cn-testinglistener/index.html  test����
public class TestngListener extends TestListenerAdapter {  //�̳�testng��һ�������¼���
	//��д�����һ��ʧ�ܼ�������
	  @Override
	  public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		System.out.println("success");
	  }

	  @Override
	  public void onTestFailure(ITestResult tr) {
		  super.onTestFailure(tr);
		  System.out.println("O(��_��)O����~O(��_��)O����~");

		  //�����Լ�д�Ľ�ͼ����
		  try {
			this.shotScreen(tr);
			  System.out.println("O(��_��)O����~O(��_��)O����~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  public void shotScreen(ITestResult tr) throws IOException {
		  TestDriver dr = (TestDriver)tr.getInstance();
		  dr.shotScreen();	  
	  }
	  @Override
	  public void onTestStart(ITestResult result) {
		  super.onTestStart(result);
		  System.out.println("onTestStart");
	  }
	  
	  @Override
	  public void onTestSkipped(ITestResult tr) {
		  super.onTestSkipped(tr);
		  System.out.println("onTestSkipped");

	  }
	  
	  
	  @Override
	  public void onStart(ITestContext testContext) {
		  super.onStart(testContext);
		  System.out.println("onStart");

	  }

	  @Override
	  public void onFinish(ITestContext testContext) {
		  super.onFinish(testContext);
		  System.out.println("onFinish");

	  }
	  
	  
	
}
