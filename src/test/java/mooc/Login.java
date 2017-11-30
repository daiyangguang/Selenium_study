package mooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	WebDriver driver;
	public void initDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.imooc.com");
		driver.manage().window().maximize();
	    //try a bad boy
	}
	public void loginScript() throws Exception {
    Thread.sleep(2000);
	driver.findElement(By.id("js-signin-btn")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("17721010137");
	driver.findElement(By.name("password")).sendKeys("mk123457");
	WebElement element = driver.findElement(By.id("auto-signin"));
	if (element.isSelected()) {
	}
	else {
		element.click();
	}
	driver.findElement(By.className("btn-red")).click();
	
	
	
	}
	public static void main(String[] args) throws Exception {
		Login test = new Login();
		test.initDriver();
		test.loginScript();
	}
}
