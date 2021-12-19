package POMhandingbyExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepageByExcel {

	@FindBy(xpath="//span[@class='user-id']") private WebElement Userid;
	@FindBy(xpath="//span[@class='user-id']") private WebElement LogoutButton;

	public KiteHomepageByExcel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UserIdValidation()
	{
	    String ActualText = Userid.getText();
	    String ExpectedText = "YT2353";
	    if(ActualText.equals(ExpectedText))
		{
			System.out.println("TestCase is passed");
		}
		else
		{
			System.out.println("TestCase is Failed");
		}
	}
	public void CLickOnLogout()
	{
		LogoutButton.click();
	}

}
