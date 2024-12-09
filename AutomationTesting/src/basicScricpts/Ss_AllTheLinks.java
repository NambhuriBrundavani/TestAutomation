package basicScricpts;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss_AllTheLinks 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com");
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  int Count = links.size();
		  for(int i=0;i<Count;i++)
		  {
			  WebElement link = links.get(i);
			  File temp=link.getScreenshotAs(OutputType.FILE);
			  File perm =new File("./Screenshots/Link"+i+".png");
			  FileHandler.copy(temp, perm);  
		  }
		  driver.quit();
	}

}
