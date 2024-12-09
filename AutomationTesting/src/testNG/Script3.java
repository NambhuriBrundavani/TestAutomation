package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script3 {
	@Test(invocationCount = 2)
	public void TestCase()
	{
		Reporter.log("HELLO",true);
	}
	@Test(invocationCount = 0)
	public void TestCase1()
	{
		Reporter.log("HELLO",true);
	}

}
