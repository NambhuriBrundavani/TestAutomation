
package basicScricpts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE_desabledEle_clearData 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("file:///C:/Users/Nambhuri%20Rajesh/Desktop/HTML/JSE.html");
		  Thread.sleep(1000);
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('a1').value=''");
	}

}
