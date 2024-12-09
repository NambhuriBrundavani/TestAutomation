package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Own1 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.cssSelector("input[id='search']"));
		ele.sendKeys("butter song");
		Thread.sleep(1000);
		ele.submit();
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.cssSelector("a[id='video-title']"));
		ele1.click();
	}

}
