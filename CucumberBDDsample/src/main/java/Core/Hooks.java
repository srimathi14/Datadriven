package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;

import io.cucumber.java.Before;

public class Hooks {
	
	public static RemoteWebDriver driver=null;
	
	@Before
	public void intialize() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}
	
	
	@After
	public void Quit() {
		driver.quit();
	}
	

}
