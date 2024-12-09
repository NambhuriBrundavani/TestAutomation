package testNG;

import org.testng.annotations.Test;

public class Script5 {
	@Test
	public void signup()
	{
		System.out.println("signup is successfull");
	}
	@Test
	public void login()
	{
		System.out.println("login is successfull");
	}
	@Test(enabled = false)
	public void homepage()
	{
		System.out.println("homepage is successfull");
	}

	@Test
	public void logout()
	{
		System.out.println("logout is successfull");
	}

}
