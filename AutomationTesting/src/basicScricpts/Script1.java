package basicScricpts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 
{
	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value="./Softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
	}

}
