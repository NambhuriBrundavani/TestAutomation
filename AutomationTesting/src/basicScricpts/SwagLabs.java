package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SwagLabs 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("user-name"));
		usn.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.id("password"));
		psw.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		ele.click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String pro = ele1.getText();
		System.out.println(pro);
		Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		String text = price.getText();
		String text5=text.replace("$","");
		System.out.println(text5);
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//button[.='ADD TO CART']"));
		add.click();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.tagName("path"));
		ele2.click();
		Thread.sleep(2000);
		WebElement ele3 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String pro1 = ele3.getText();
		System.out.println(pro1);
		Thread.sleep(2000);
		WebElement price1 = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		String text1 = price1.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//button[.='Open Menu']"));
		menu.click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//a[.='Logout']"));
		logout.click();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
