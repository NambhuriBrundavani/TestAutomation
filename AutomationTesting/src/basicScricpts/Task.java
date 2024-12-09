package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://106.51.87.42:9007/");
		WebElement ele = driver.findElement(By.id("email"));
		ele.sendKeys("Fresher@gmail.com");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.sendKeys("Fresher@2024");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//button[@type='submit']"));
		ele2.submit();
		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(By.xpath("//a[@href='http://106.51.87.42:9007/index.php?doctor/patient']"));
		ele3.click();
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
		button.click();
		Thread.sleep(5000);
		WebElement Name = driver.findElement(By.id("field-1"));
		Name.sendKeys("Brunda");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("Brunda@gmail.com");
		Thread.sleep(1000);
		WebElement psw = driver.findElement(By.name("password"));
		psw.sendKeys("Brunda@123");
		Thread.sleep(1000);
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("Kalakada");
		Thread.sleep(1000);
		WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys("7032773834");
		Thread.sleep(1000);
		WebElement sex = driver.findElement(By.name("sex"));
		sex.click();
		WebElement female = driver.findElement(By.xpath("//option[@value='female']"));
		female.click();
		Thread.sleep(1000);
    }

}
