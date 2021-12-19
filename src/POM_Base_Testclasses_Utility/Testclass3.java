package POM_Base_Testclasses_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass3 extends Base1 {

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
		Thread.sleep(1000);
	}
	@BeforeMethod
	public void Kite_Login() throws EncryptedDocumentException, IOException, InterruptedException
	{

//		login.EnterUserId(Utility1.getDataFromExcel(1, 0));
////		login.EnterPassword(Utility1.getDataFromExcel(1, 1));
//		Thread.sleep(1000);
		login.ClickOnLoginButton();
		Reporter.log("Entering userid and password",true);
		 Thread.sleep(1000);

//		Reporter.log("Entering pin..",true);
//	    pin.EnterPin(Utility.getDataFromExcel(0, 2));
//	    pin.ClickOnContinueButton();
//	    Thread.sleep(1000);

	}
  @Test
public void GetErrormsgs() throws EncryptedDocumentException, IOException, InterruptedException {
 int TCID=9;
	 String ExpectedErrormsgUserid = Utility1.getDataFromExcel(2, 3);
	 String ActualErrormsgUserid = login.getUseridmsg();

	 String ExpectedErrormsgPass = Utility1.getDataFromExcel(3, 3);
	 String ActualErrormsgPass = login.getErrormsgPsw();

	 Assert.assertEquals(ActualErrormsgUserid, ExpectedErrormsgUserid,"Testcase is failed error msg of userid is not matched");
	 Reporter.log("Testcase is passed error msg of userid is matched",true);
	 Thread.sleep(1000);

	 Assert.assertEquals(ExpectedErrormsgPass, ActualErrormsgPass,"Testcase is failed error msg of psw is not matched");
	 Reporter.log("Testcase is passed error msg of psw is matched",true);
	 Reporter.log("Validation done...",true);
	 Thread.sleep(1000);
	  Utility1.CaptureScreenshot(driver, TCID);
	  Reporter.log("Taking Screenshot...",true);


  }
  @AfterMethod(enabled = false)
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
