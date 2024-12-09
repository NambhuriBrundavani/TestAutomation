package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ifram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nambhuri Rajesh/Desktop/HTML/Main1.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin");
		driver.switchTo().frame(0);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("admin@123");
		driver.switchTo().frame(0);
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("9234567134");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebDriver ele = driver.switchTo().parentFrame();
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		email.clear();
		driver.switchTo().parentFrame();
		mob.clear();
		driver.switchTo().defaultContent();
		usn.clear();
		//driver.quit();
	}

}
