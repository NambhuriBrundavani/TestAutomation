package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoQsp 
{
	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	WebElement css = driver.findElement(By.cssSelector("input[id='name']"));
	Thread.sleep(2000);
	css.sendKeys("brunda");
	WebElement css1 = driver.findElement(By.cssSelector("input[id='email']"));
	Thread.sleep(2000);
	css1.sendKeys("brunda@gmail.com");
	WebElement css2 = driver.findElement(By.cssSelector("input[id='password']"));
	Thread.sleep(2000);
	css2.sendKeys("123456");
	WebElement css3 = driver.findElement(By.cssSelector("button[type='submit']"));
	css3.click();
	}
	

}
