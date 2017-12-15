package TestNetClass;


import java.io.File;
import java.io.IOException;
import java.sql.Date;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
@Listeners({TestngListener.class})
//@Listeners({TestngListenerScreenShot.class})

public class AutoLogin extends TestDriver {
	static Logger logger = Logger.getLogger(AutoLogin.class);
//	@Test
//	public void initDirver() {
//	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.get("https://www.dadaabc.com/");
//	driver.manage().window().maximize();
		
//	}
	/*
	 * ��¼����
	 * */
	
	public void loginScript(String userName, String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("account")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("submitLogin")).click();
		
		//��¼��ȥ �����������
		Thread.sleep(2000);
		WebElement pop_ups = driver.findElement(By.className("sweet-alert"));
		WebElement cancelBtn = driver.findElement(By.className("cancel"));
		//��ⵯ��ʱ����� 
		if (pop_ups.isDisplayed()) {
			cancelBtn.click();
		}
		this.checkInfo();
	}
	
	
	public void checkInfo() {
		String  name = driver.findElement(By.className("name")).getText();
		if (name.equals("����-С���� (test-dai)")) {
			System.out.println("��¼�ɹ�");
		}
		else {
			System.out.println("��¼ʧ��");
		}
		
	}
	/**
	 * ʧ�ܽ�ͼ������¼ʧ��or�˻���Ϣ���Ե�ʧ�ܣ�
	 * @throws IOException 
	 */
//	public void shotScreen() throws IOException {
//		long tStamp = System.currentTimeMillis();
//		String picName = DateConvert.stampToDate(String.valueOf(tStamp));
//		String currentPath = System.getProperty("user.dir");
//		String picLoaction = currentPath + "\\src\\dada\\" + picName + ".png";
//		System.out.println(picLoaction);
//		//��ͼ���� ���ļ��ķ�ʽ����
//		File shotScreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		//�ļ�����----ԴͼƬ���Ƶ�Ŀ��λ��
//		try {
//			FileUtils.copyFile(shotScreen, new File(picLoaction));
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
	
//	@Test(dependsOnMethods = {"initDirver"})
	@Test
	//������
	public void inputInfo() throws InterruptedException, IOException {
//		this.loginScript("17721010137", "111111");
		logger.debug("��һ��ʹ��log4j������־~");
		ReadFileUtil prop = new ReadFileUtil("account.properties");
		String userName = prop.getPro("username");
		String passWord = prop.getPro("password");
		System.out.println(userName + passWord);
		this.loginScript(userName, passWord);
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		logger.debug("��һ��ʹ��log4j������־~");
		System.out.println("log4j");
		AutoLogin login = new AutoLogin();
		login.shotScreen();
		
	}
	
}
