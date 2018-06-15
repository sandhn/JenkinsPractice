package src.com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import src.com.amazon.generic.BasePage;



public class SignInPage extends BasePage
{
	@FindBy(id="txtUsername")
	private WebElement un;
	
	@FindBy(id="txtPassword")
	private WebElement pwd;
	
	@FindBy(id="btnLogin")
	private WebElement loginBTN;
	
	public SignInPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username,String password) throws InterruptedException
	{
		un.sendKeys(username);
		pwd.sendKeys(password);
		loginBTN.click();
	
	}
	public void verifyTitle(String eTitle)
	{
		VerifyElement(eTitle);
	}
	
	
}
