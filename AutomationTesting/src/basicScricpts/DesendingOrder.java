package basicScricpts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesendingOrder {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/Dropdown.html");
		  WebElement dd = driver.findElement(By.id("Celebrities"));
		  Select s =new Select(dd);
		  List<WebElement> opts = s.getOptions();
		  int count=opts.size();
		  System.out.println(count);
		  ArrayList<String> arr=new ArrayList<String>();
		  for(int i=0;i<count;i++)
		  {
			  WebElement opt=opts.get(i);
			  String txt=opt.getText();
			  arr.add(txt);
		  }
		  Collections.sort(arr, Collections.reverseOrder());
		  for(String ar:arr)
		  {
			  System.out.println(ar);
		  }
		  Thread.sleep(1000);
		  driver.quit();
	}

}
