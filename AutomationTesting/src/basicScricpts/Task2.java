package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/page.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text'][1]"));
		usn.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		usn.sendKeys(Keys.BACK_SPACE);
		//usn.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text'][2]"));
		psw.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		psw.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1000);
		usn.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(1000);
}

}
