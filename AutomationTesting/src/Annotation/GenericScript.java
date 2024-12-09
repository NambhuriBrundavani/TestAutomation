package Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {
	WebDriver driver;
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	    driver=new FirefoxDriver();
//	    System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
//	    driver=new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    Thread.sleep(2000);
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}

}
