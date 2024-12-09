package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE_ArgumentDisableEle 
{
	public static void main(String[] args) throws Exception 
	{
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/JSE%201.html");
		  Thread.sleep(1000);
		  WebElement usn = driver.findElement(By.xpath("//input[@class='c1']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  Thread.sleep(1000);
		  js.executeScript("arguments[0].value=' '",usn);
	}

}
