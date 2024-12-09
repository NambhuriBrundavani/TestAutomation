package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMap 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9989714,77.5504773,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
		WebElement ele = driver.findElement(By.cssSelector("span[class='google-symbols NhBTye G47vBd']"));
		//ele.click();
		//WebElement ele1 = driver.findElement(By.xpath("input[@class='tactile-searchbox-input']"));
		//ele1.sendKeys("Rajajinagar, Bengaluru, Karnataka");
	}

}
