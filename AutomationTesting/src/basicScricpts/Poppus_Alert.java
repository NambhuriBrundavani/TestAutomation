package basicScricpts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Poppus_Alert 
{
	public static void main(String[] args) throws Exception
	{

		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		  Thread.sleep(2000);
		  WebElement ele = driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
		  ele.click();
		  Alert popup = driver.switchTo().alert();
		  popup.sendKeys("yes");
		  String msg = popup.getText();
		  System.out.println(msg);
		  driver.quit();
	}
	

}
