package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genericScript {
	protected WebDriver driver;
	@BeforeMethod
	public void BrowserSetup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	    driver=new FirefoxDriver();
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
