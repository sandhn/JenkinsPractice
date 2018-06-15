package src.com.amazon.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage 
{
	public static WebDriver driver;
	public BasePage(WebDriver driver)
	{
		BasePage.driver=driver;
	}
	public static void VerifyElement(String eTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching "+eTitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching "+eTitle,true);
			Assert.fail();
		}
	}
}
