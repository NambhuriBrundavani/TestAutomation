package basicScricpts;

import java.awt.Robot;
import java.awt.event.KeyEvent;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com");
		  WebElement cart = driver.findElement(By.xpath("//a[.='Cart']"));
		  Actions a=new Actions(driver);
		  Thread.sleep(2000);
		  a.contextClick(cart).perform();
		  
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(2000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
			  
	}

}
