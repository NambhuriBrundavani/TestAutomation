package basicScricpts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_task 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/text.html");
		  List<WebElement> text = driver.findElements(By.xpath("//input"));
		  int count = text.size();
		  for(int i=1;i<count;i=i+2)
		  {
	
			WebElement txt = text.get(i);
			 txt.clear();
		  }
		  //Thread.sleep(2000);
	}

}
