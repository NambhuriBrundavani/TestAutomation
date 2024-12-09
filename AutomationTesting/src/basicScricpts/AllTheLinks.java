package basicScricpts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTheLinks 
{
	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.flipkart.com");
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  int count = links.size();
		  System.out.println(count);
		  Thread.sleep(1000);
		  driver.quit();
	}

}
