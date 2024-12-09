package testNG_Assertions;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script1 {
	@Test
	public void signup()
	{
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  String ExceptedTitle = "Facebook – log in or sign up";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle,ExceptedTitle);
		  System.out.println(ActualTitle);
		  driver.quit();
	}

}
