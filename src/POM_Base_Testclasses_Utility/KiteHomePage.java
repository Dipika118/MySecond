package POM_Base_Testclasses_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[@class='user-id']") private WebElement Userid;
	@FindBy(xpath="//span[@class='user-id']") private WebElement LogoutButton;

	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String UserIdValidation()
	{
	    String ActualText = Userid.getText();
		return ActualText;
//	    if(ActualText.equals(ExpectedText))
//		{
//			System.out.println("TestCase is passed");
//		}
//		else
//		{
//			System.out.println("TestCase is Failed");
//		}
	}
	public void ClickOnUserID() {
		Userid.click();
	}
	public void CLickOnLogout()
	{
		LogoutButton.click();
	}
}
