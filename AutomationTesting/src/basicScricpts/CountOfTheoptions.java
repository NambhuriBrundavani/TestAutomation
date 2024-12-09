package basicScricpts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountOfTheoptions 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/Dropdown.html");
		  WebElement dd = driver.findElement(By.id("Celebrities"));
		  Select s =new Select(dd);
		  List<WebElement> opts = s.getOptions();
		  int count=opts.size();
		  System.out.println(count);
		  for(int i=0;i<count;i++)
		  {
			  WebElement opt = opts.get(i);
			  String txt = opt.getText();
			  System.out.println(txt);  
		  }
		  Thread.sleep(2000);
		  driver.quit();
	
}

}
