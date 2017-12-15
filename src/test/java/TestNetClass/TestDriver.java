package dada;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {
	WebDriver driver;
	public TestDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.dadaabc.com/");
		driver.manage().window().maximize();
	}
	
	/**
	 * 失败截图，（登录失败or账户信息不对的失败）
	 * @throws IOException 
	 */
	public void shotScreen() throws IOException {
		long tStamp = System.currentTimeMillis();
		String picName = DateConvert.stampToDate(String.valueOf(tStamp));
		String currentPath = System.getProperty("user.dir");
		String picLoaction = currentPath + "\\src\\dada\\" + picName + ".png";
		System.out.println(picLoaction);
		//截图方法 以文件的方式保存
		File shotScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//文件命名----源图片复制到目标位置
		try {
			FileUtils.copyFile(shotScreen, new File(picLoaction));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
