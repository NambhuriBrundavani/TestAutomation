package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Annotation.GenericScript;

public class TestCase01 extends genericScript
{
	@Test
	public void login() throws InterruptedException 
	{
	
		
		loginPage lp=new loginPage(driver);
		lp.EnterUsn();
		lp.Enterpsw();
		//lp.Clicklogin();
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.EnterUsn();
		lp.Enterpsw();
		
	}
	
	

}
