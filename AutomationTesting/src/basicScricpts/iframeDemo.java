package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeDemo 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(1000);
		WebElement f1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("Admin@gmail.com");
		Thread.sleep(2000);
		WebElement  psw= driver.findElement(By.id("password"));
		psw.sendKeys("Admin@123");
		Thread.sleep(2000);
		WebElement  Cpsw= driver.findElement(By.id("confirm-password"));
		Cpsw.sendKeys("Admin@123");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement f2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(f2);
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("username"));
		usn.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement psw1 = driver.findElement(By.id("password"));
		psw1.sendKeys("Admin@123");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
