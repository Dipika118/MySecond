package POM_Base_Testclasses_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass1 extends Base1  {

	WebDriver driver = null;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;

	@BeforeClass
	public void LaunchingBrowser() throws InterruptedException {

		InitialiseBrowser();
		login= new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home= new KiteHomePage(driver);

		Reporter.log("Launching browser....",true);
	}
	@BeforeMethod
	public void Kite_Login() throws EncryptedDocumentException, IOException, InterruptedException
	{

		login.EnterUserId(Utility1.getDataFromExcel(0, 0));
		login.EnterPassword(Utility1.getDataFromExcel(0, 1));
		Thread.sleep(1000);
		login.ClickOnLoginButton();
		Reporter.log("Entering userid and password",true);
		 Thread.sleep(1000);

		Reporter.log("Entering pin..",true);
	    pin.EnterPin(Utility1.getDataFromExcel(0, 2));
	    pin.ClickOnContinueButton();
	    Thread.sleep(1000);

	}
  @Test
  public void UserIdValidation() throws EncryptedDocumentException, IOException, InterruptedException {
	  int TCID=11;
	  String ActualText = home.UserIdValidation();
	  String ExpectedText = Utility1.getDataFromExcel(0, 0);

	  Thread.sleep(1000);
	  Assert.assertEquals(ActualText, ExpectedText,"Testcase is failed Text is not matchng");
	  Reporter.log("Testcase is passed Text is matching",true);
	  Reporter.log("Validation done...",true);
	  Thread.sleep(1000);
	  Utility1.CaptureScreenshot(driver, TCID);
	  Reporter.log("Taking Screenshot...",true);


  }
  @AfterMethod
  public void Kite_Logout() throws InterruptedException{
	  home.ClickOnUserID();
	  Thread.sleep(1000);
	  home.CLickOnLogout();
	  Reporter.log("Logging out....",true);

  }
  @AfterClass
	  public void ClosingBrowser() throws InterruptedException
	  {
	     Thread.sleep(1000);
	     Reporter.log("Closing browser....",true);
		 driver.close();
	  }
}
