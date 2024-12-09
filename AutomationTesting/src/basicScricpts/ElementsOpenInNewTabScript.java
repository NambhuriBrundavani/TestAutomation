package basicScricpts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementsOpenInNewTabScript 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/downloads/");
	  Thread.sleep(2000);
	  WebElement ele1 = driver.findElement(By.xpath("(//span[text()='Downloads']"));
	  WebElement ele2 = driver.findElement(By.xpath("(//span[text()='Documentation']"));
	  WebElement ele3 = driver.findElement(By.xpath("(//span[text()='Projects']"));
	  WebElement ele4 = driver.findElement(By.xpath("(//span[text()='Support']"));
	  ArrayList<WebElement> arr=new ArrayList<WebElement>();
	  Thread.sleep(1000);
	  arr.add(ele1);
	  arr.add(ele2);
	  arr.add(ele3);
	  arr.add(ele4);
	  System.out.println(arr);
	  Actions a=new Actions(driver);
	  Robot r=new Robot();
	   for(WebElement we : arr)
	   {
	  
	      a.contextClick(we).perform();
		  
		  r.keyPress(KeyEvent.VK_T);
		  Thread.sleep(1000);
		  r.keyRelease(KeyEvent.VK_T);
		  Thread.sleep(1000);
		 
	  }
	   Set<String> allwh=driver.getWindowHandles();
	   for(String wh :allwh)
	   {
		   driver.switchTo().window(wh);
		   Thread.sleep(1000);
	   }
	   Thread.sleep(1000);
	   driver.quit();
	}


}
