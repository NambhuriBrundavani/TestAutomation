package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/Brunda.html");//Dummy URL
		WebElement ele = driver.findElement(By.id("t1"));
		ele.sendKeys("brunda");
		WebElement ele1 = driver.findElement(By.name("n1"));
		ele1.sendKeys("brunda@123");
		WebElement ele2 = driver.findElement(By.className("c1"));
		ele2.sendKeys("brunda@123");
		WebElement ele3 = driver.findElement(By.linkText("Instagram 2024"));
		Thread.sleep(2000);
		ele.clear();
		ele3.click();
	}

	

}
