package basicScricpts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelenumDownload_Tabs 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement net = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
		WebElement ruby = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
		WebElement python = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		WebElement js = driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("net");
		arr.add("ruby");
		arr.add("python");
		arr.add("js");
		int count=arr.size();
		for(int i=0;i<count;i++)
		{
		Actions a=new Actions(driver);
		a.contextClick().perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
	}

}
