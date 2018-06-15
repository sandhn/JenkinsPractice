package src.com.amazon.tests;

import org.testng.annotations.Test;

import src.com.amazon.generic.BaseTest;
import src.com.amazon.generic.ExcelData;
import src.com.amazon.pages.SignInPage;

public class InvalidLoginLogout extends BaseTest
{
	@Test
	public void intestvalidlogin() throws InterruptedException
	{
		String un=ExcelData.getdata("Sheet1", 1, 0);
		String pwd= ExcelData.getdata("Sheet1", 1, 1);
		
		Thread.sleep(3000);
		SignInPage sip=new SignInPage(driver);
		sip.login(un, pwd);
		
		sip.verifyTitle("OrangeHRMF");
		
	}
}
