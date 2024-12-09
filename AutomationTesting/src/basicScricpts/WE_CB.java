package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_CB 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/WE.html");
		WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected())
				{
					System.out.println("it is selected");
					Thread.sleep(2000);
					cb.click();
				}
			    else
			      {
				   System.out.println("it is not selected");
			      }
			}
			else
			{
				System.out.println("it is disabled");
		    }
		}
		else
		{
			System.out.println("it is not disabled");
		}
	}

}
