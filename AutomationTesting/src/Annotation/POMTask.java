package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class POMTask {
	@Test
	public void BrowserSetup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    WebElement usn = driver.findElement(By.id("email"));
	    usn.sendKeys("Admin");
	    WebElement psw = driver.findElement(By.id("pass"));
	    psw.sendKeys("Admin@123");
	    driver.navigate().refresh();
	    //usn.sendKeys("Admin");
	    //psw.sendKeys("Admin@123");
	    //Exception:StaleElementReferenceException
	    usn = driver.findElement(By.id("email"));
	    usn.sendKeys("Admin");
	    psw = driver.findElement(By.id("pass"));	    
	    psw.sendKeys("Admin@123");
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}
//open chrome browser
//enter facebook url
//locate usn store in ref variable, locate psw and strore in ref variable
//enter usn using ref var and enter psw using ref var
//Refresh the page
//Again enter usn and psw using same ref var.
//Exception:StaleElementReferenceException