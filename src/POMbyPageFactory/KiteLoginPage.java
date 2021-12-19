package POMbyPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	//1. Declaration_Of_Variables/Web_Element/Data_members

	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;

	//2. Constructor

	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//3. Usage for Variables

	public void EnterUsername()
	{
		UserId.sendKeys("YT2353");
	}
	public void EnterPassword()
	{
		Password.sendKeys("Pass@123");
	}
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}

}
