package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Own 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement css=driver.findElement(By.cssSelector("input[id='search']"));
		css.sendKeys("song");
		Thread.sleep(1000);
		css.submit();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.cssSelector("h3[id='video-title']"));
		ele.click();
		//driver.findElement(By.id("watch7-content")).click();

	}

}
