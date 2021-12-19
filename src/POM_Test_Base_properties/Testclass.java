package POM_Test_Base_properties;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass extends Base{

	KiteZ_LoginPage login;
	KiteZ_PinPage pin;
	KiteZ_HomePage home;

	@BeforeClass
	public void LaunchingBrowser() throws InterruptedException, IOException {

		Reporter.log("Launching browser....",true);
	    InitialiseBrowser();
		login= new KiteZ_LoginPage(driver);
		pin = new KiteZ_PinPage(driver);
		home= new KiteZ_HomePage(driver);
		Thread.sleep(1000);
	}
	@BeforeMethod
	public void Kite_Login() throws EncryptedDocumentException, IOException, InterruptedException
	{

		login.EnterUserId(Utility.gettingdatafromProperties("UN"));
		login.EnterPassword(Utility.gettingdatafromProperties("PSW"));
		Thread.sleep(1000);
		login.ClickOnLoginButton();
		Reporter.log("Entering userid and password",true);

		 Thread.sleep(1000);
		Reporter.log("Entering pin..",true);
	    pin.EnterPin(Utility.gettingdatafromProperties("PIN"));
	    pin.ClickOnContinueButton();
	    Thread.sleep(1000);

	}
  @Test
  public void UserIdValidation() throws EncryptedDocumentException, IOException, InterruptedException {
	  String ActualText = home.UserIdValidation();
	  String ExpectedText = Utility.gettingdatafromProperties("UN");
  int TCID = 1;
	  Thread.sleep(1000);
	  Assert.assertEquals(ActualText, ExpectedText,"Testcase is failed Text is not matchng");
	  Reporter.log("Testcase is passed Text is matching",true);
	  Reporter.log("Validation done...",true);
	  
	  Utility.CaptureScreenshot(driver, TCID);
	  Reporter.log("taking screenshot...",true);


  }
  @AfterMethod
  public void Kite_Logout() throws InterruptedException{
	  home.ClickOnUserID();
	  Thread.sleep(1000);
	  home.CLickOnLogout();
	  Reporter.log("Logging out....",true);
	  Thread.sleep(1000);

  }
  @AfterClass
	  public void ClosingBrowser() throws InterruptedException
	  {
	     Thread.sleep(1000);
	     Reporter.log("Closing browser....",true);
		 driver.close();
	  }

}
