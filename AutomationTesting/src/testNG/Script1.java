package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 {
	@Test
	public void TestCase()
	{
		Reporter.log("HELLO",true);
	}

}
