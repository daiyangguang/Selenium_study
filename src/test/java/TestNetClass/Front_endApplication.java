package TestNetClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Front_endApplication {
		WebDriver driver;
		public void initDriver() {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("");
			driver.manage().window().maximize();
		    //try a bad boy and a girl named ada jaja
		}
}
