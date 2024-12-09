package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_WithoutClear 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/Clear.html");
	WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(1000);
	usn.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(1000);
	usn.sendKeys(Keys.BACK_SPACE);
	driver.quit();
	}
}
