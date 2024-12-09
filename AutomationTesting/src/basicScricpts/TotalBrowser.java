package basicScricpts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
		  Thread.sleep(2000);
		  driver.findElement(By.id("browserButton3")).click();
		  Set<String> win = driver.getWindowHandles();
		  int count = win.size();
		  System.out.println(count);
		  driver.quit();
	}

}
