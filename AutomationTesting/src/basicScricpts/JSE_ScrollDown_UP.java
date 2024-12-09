package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE_ScrollDown_UP 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		  Thread.sleep(2000);
		  WebElement ele = driver.findElement(By.xpath("//h3[.='b. Premium Materials']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  Thread.sleep(2000);
		  //Scrolldown 
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		 //ScrollUp
		  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
