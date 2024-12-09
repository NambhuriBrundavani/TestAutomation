package basicScricpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeExample {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nambhuri Rajesh/Desktop/HTML/Main1.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']")); // Assuming an ID for uniqueness
		usn.sendKeys("admin");
		driver.switchTo().frame(0);

		// Interact with elements inside the iframe
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']")); // Use unique identifiers
		psw.sendKeys("admin@123");
		Thread.sleep(1000);

		WebElement mob = driver.findElement(By.xpath("//input[@type='text']")); // Use unique identifiers
		mob.sendKeys("9234567134");
		Thread.sleep(1000);

		// Switch back to the parent frame
		driver.switchTo().parentFrame();

		// Interact with elements outside the iframe again
		WebElement email = driver.findElement(By.xpath("//input[@type='text']")); // Use unique identifiers
		email.sendKeys("admin@gmail.com");

		// Clear inputs as needed
		Thread.sleep(2000);
		email.clear();

		// Optionally clear the mobile number as well
		driver.switchTo().frame(0); // Switch back to iframe to clear mobile
		Thread.sleep(2000);
		mob.clear();

		// Switch back to the default content
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		usn.clear();

		// Close the browser
		driver.quit();
	}
}
