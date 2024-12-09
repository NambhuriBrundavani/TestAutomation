package basicScricpts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetEvenCheckBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/Checkbox.html");
	  List<WebElement> check = driver.findElements(By.xpath("//input"));
	  int count = check.size();
	  for(int i=0;i<count;i=i++)//for(int i=0;i<count;i=i+2)
	  {
		  if(i%2==0)//even
			  //if(i%2!=0)//Odd
		  {
		    WebElement cb = check.get(i);
		    cb.click();
		  }
	  }
	  Thread.sleep(2000);
	  driver.quit();
	}
}
