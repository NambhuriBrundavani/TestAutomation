package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script2 {
	@Test
	public void TestCase()
	{
		Reporter.log("HELLO",true);
	}
	@Test
	public void TestCase1()
	{
		Reporter.log("Good Morning",true);
	}

}
