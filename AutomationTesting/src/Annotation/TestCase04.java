package Annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase04 extends GenericScript
{
	@Test 
	public void login()
	{
		 boolean displayed = driver.findElement(By.tagName("button")).isDisplayed();
		 boolean enabled = driver.findElement(By.tagName("button")).isEnabled();
		 System.out.println(displayed+" "+enabled);
	}


}
