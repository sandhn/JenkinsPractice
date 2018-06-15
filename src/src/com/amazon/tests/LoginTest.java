package src.com.amazon.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import src.com.amazon.generic.BaseTest;
import src.com.amazon.generic.ExcelData;
import src.com.amazon.pages.SignInPage;

@Listeners(src.com.amazon.generic.ListernsClass.class)

public class LoginTest extends BaseTest
{
	@Test
	public void testvalidlogin() throws InterruptedException
	{
		String un=ExcelData.getdata("Sheet1", 0, 0);
		String pwd= ExcelData.getdata("Sheet1", 0, 1);
		
		Thread.sleep(3000);
		SignInPage sip=new SignInPage(driver);
		sip.login(un, pwd);
		sip.verifyTitle("OrangeHRM");
		
	}
}
