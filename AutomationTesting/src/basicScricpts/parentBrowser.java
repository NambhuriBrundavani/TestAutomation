package basicScricpts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parentBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	  Thread.sleep(2000);
	  String pb = driver.getWindowHandle();
	  System.out.println(pb);
	}

}
