package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebcssValue 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement usn = driver.findElement(By.id("email"));
		String value = usn.getCssValue("background-color");
		System.out.println(value);
		String fontfamily = usn.getCssValue("font-family");
        System.out.println(fontfamily);
        String size = usn.getCssValue("font-size");
        System.out.println("size");
		//driver.quit();
	}

}
