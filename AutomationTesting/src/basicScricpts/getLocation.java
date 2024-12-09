package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  WebElement usn = driver.findElement(By.id("email"));
		  Point loc = usn.getLocation();
		  System.out.println(loc);
		  int x = loc.getX();
		  int y = loc.getY();
		  System.out.println(x);
		  System.out.println(y);
		  Thread.sleep(1000);
		  driver.quit();
	}

}
