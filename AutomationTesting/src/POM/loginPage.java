package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class loginPage 
{
	@FindBy(id="email")       //Declarization
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(name="login")
	private WebElement login;
	                          //Initialization
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	                          //Utilization
	public void EnterUsn()
	{
		 usn.sendKeys("admin");
    }
	public void Enterpsw()
	{
		 usn.sendKeys("admin@123");
    }
	public void Clicklogin()
	{
		 usn.click();
    }
	

}
