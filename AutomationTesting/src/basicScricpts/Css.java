package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {
	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
	email.sendKeys("Brunda");
	WebElement psw = driver.findElement(By.cssSelector("input[id='pass']"));
	psw.sendKeys("123456");
	WebElement login = driver.findElement(By.cssSelector("button[id='u_0_5_DQ']"));
	login.click();
	//Thread.sleep(2000);
	//driver.quit();
	}

}
