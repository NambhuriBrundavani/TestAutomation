package basicScricpts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Syn_implicit
{
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  WebElement ele = driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
		  ele.click();
		  Alert popup = driver.switchTo().alert();
		  popup.sendKeys("yes");
		  String msg = popup.getText();
		  System.out.println(msg);
		  driver.quit();
	}

}
