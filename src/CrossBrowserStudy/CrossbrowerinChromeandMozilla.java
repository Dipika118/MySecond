package CrossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POMbyPageFactory.KiteDashboardPage;
import POMbyPageFactory.KiteLoginPage;
import POMbyPageFactory.KitePinValidationPage;

public class CrossbrowerinChromeandMozilla {
  @Parameters("BrowserNames")
  @Test
  public void Sample1(String BrowserNames) throws InterruptedException {
	  WebDriver driver = null;
	if(BrowserNames.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		    driver = new ChromeDriver();
	  }

	  else if(BrowserNames.equals("Firefox")){
		  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		  driver = new FirefoxDriver();
	  }
	Reporter.log("Launch browser....",true);
	 driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);

	Reporter.log("Logging in.....",true);
	KiteLoginPage obj1=new KiteLoginPage(driver);
	obj1.EnterUsername();
	Thread.sleep(1000);
	obj1.EnterPassword();
	obj1.ClickOnLoginButton();
	Thread.sleep(1000);

	Reporter.log("Enter pin successfully.....",true);
	KitePinValidationPage obj2 = new KitePinValidationPage(driver);
	obj2.EnterPin();
	Thread.sleep(1000);

	Reporter.log("Test Validation done.....",true);
	Thread.sleep(1000);
	KiteDashboardPage obj3 = new KiteDashboardPage(driver);
    obj3.UserIdValidation();

    Thread.sleep(1000);

    Reporter.log("Logging out...",true);
    obj3.ClickOnLogout();


    Reporter.log("Close Browser",true);
    driver.close();
    Thread.sleep(1000);
  }
}
