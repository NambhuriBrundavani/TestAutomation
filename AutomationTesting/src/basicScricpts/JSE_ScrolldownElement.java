package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_ScrolldownElement 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/");
		  WebElement fb = driver.findElement(By.xpath("//a[text()='Instagram']"));
		  Point loc = fb.getLocation();
		  int y = loc.getY();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,"+y+")");
		  Thread.sleep(2000);
		  fb.click();
	}

}
