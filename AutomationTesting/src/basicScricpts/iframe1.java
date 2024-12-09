package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe1 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/Main2.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		WebElement f1=driver.findElement(By.xpath("//iframe[@id='f3']"));
		driver.switchTo().frame(f1);
		WebElement  mob1= driver.findElement(By.xpath("//input[@type='text']"));
		mob1.sendKeys("7032773834");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		WebElement f2=driver.findElement(By.xpath("//iframe[@id='f4']"));
		driver.switchTo().frame(f2);
		WebElement  email1= driver.findElement(By.xpath("//input[@type='text']"));
		email1.sendKeys("admin@gmail.com");
	}

}
