package basicScricpts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ss_IndividualElement 
{
	public static void main(String[] args) throws IOException, Exception 
	{
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com");
		  Date d=new Date();
		  String d1 = d.toString().replace(":", "-");
		  System.out.println(d1);
		  WebElement usn = driver.findElement(By.id("email"));
		  File temp = usn.getScreenshotAs(OutputType.FILE);
		  File perm = new File("./Screenshots/Element.png");
		  FileHandler.copy(temp, perm);
		  Thread.sleep(1000);
		  driver.quit();
	}

}
