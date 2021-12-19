package POMbyPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class KiteDashboardPage {

	@FindBy(xpath="//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath="//a[@href='/logout']") private WebElement LogoutButton;

	public KiteDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void UserIdValidation() throws InterruptedException
	{
		String ActualText = UserId.getText();
		String ExpectedText = "YT2353";

//		if(ActualText.equals(ExpectedText))
//		{
//			System.out.println("TestCase is passed");
//		}
//		else
//		{
//			System.out.println("TestCase is Failed");
//		}

		Assert.assertEquals(ActualText, ExpectedText,"Testcase is failed");
		Reporter.log("Testcase is passed",true);

//		Assert.assertNotEquals(ActualText, ExpectedText,"Testcase is failed");
//		Reporter.log("Testcase is passed",true);
		UserId.click();
	}
	public void ClickOnLogout() throws InterruptedException
	{
		LogoutButton.click();
	}
}
