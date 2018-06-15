package  src.com.amazon.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest implements AutoConst
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		 
		System.setProperty(ChromeKey ,ChromeValue);
		driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	
	

}
