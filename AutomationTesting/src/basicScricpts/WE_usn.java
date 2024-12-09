package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_usn 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/WE.html");
		/*WebElement usn = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
				usn.sendKeys("admin");
			}
			else
			{
				System.out.println("usn is disabled");
			}
		}
		else
		{
			System.out.println("usn is not disabled");
		}*/
		WebElement  psw= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		if(psw.isDisplayed())
		{
			if(psw.isEnabled())
			{
				psw.sendKeys("admin");
			}
			else
			{
				System.out.println("psw is disabled");
			}
		}
		else
		{
			System.out.println("psw is not disabled");
		}
	}

}
