package POMwith_TestNG_DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {

	WebDriver driver;
	KiteLoginPage login;
	KitePinValidationPage pin;
	KiteHomePage home;
	Sheet sh;
	String Userid;
	String PSW;
	String Pin;


	@Parameters("BrowserNames")
	@BeforeClass
	public void LaunchBrowser(String BrowserNames) throws InterruptedException, EncryptedDocumentException, IOException
	{

		if(BrowserNames.equals("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
			    driver = new ChromeDriver();

		  }

		  else if(BrowserNames.equals("firefox")){
			  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			  driver = new FirefoxDriver();

		  }

		 driver.get("https://kite.zerodha.com/");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				Reporter.log("Launch browser....",true);

				FileInputStream MyFile = new FileInputStream("C:\\Users\\User\\Documents\\ZerodaUserPsw.xlsx");
				sh = WorkbookFactory.create(MyFile).getSheet("Sheet1");

				login = new KiteLoginPage(driver);
				pin = new KitePinValidationPage(driver);
				home = new KiteHomePage(driver);

	}

	@BeforeMethod
    public void LoggingIn() throws EncryptedDocumentException, IOException, InterruptedException
    {
		 Userid = sh.getRow(0).getCell(0).getStringCellValue();
		 PSW = sh.getRow(0).getCell(1).getStringCellValue();
		 Pin = sh.getRow(0).getCell(2).getStringCellValue();

		 login.EnterUserId(Userid);
		 login.EnterPassword(PSW);
		 login.ClickOnLoginButton();
		 Reporter.log("Enter Userid and Password..",true);

			Thread.sleep(1000);
		 pin.EnterPin(Pin);
		 pin.ClickOnContinueButton();
		 Reporter.log("Enter pin....",true);

    }

	@Test
	public void ValidateUserid() throws InterruptedException
	{
		Reporter.log("Opening Homepage.....",true);
		Thread.sleep(1000);
	    String ExpectedText = sh.getRow(0).getCell(0).getStringCellValue();
		String ActualText = home.UserIdValidation();
		Assert.assertEquals(ExpectedText, ActualText, "Testcase is failed Text is not matched");
		Reporter.log("Testcase is passed Text is matched",true);

	    Reporter.log("Validation done...",true);
	}

	@AfterMethod
	public void LoggingOut() throws InterruptedException
	{

		home.ClickOnUserid();
		Thread.sleep(1000);
		home.CLickOnLogout();
		Reporter.log("Logging Out.....",true);
	}

	@AfterClass
	public void ClosingBrowser()
	{
		driver.close();
		Reporter.log("Closing Browser....",true);
	}


}
