package HardAssertStudyTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POMbyPageFactory.KiteDashboardPage;
import POMbyPageFactory.KiteLoginPage;
import POMbyPageFactory.KitePinValidationPage;

public class AssertEqualsStudy {
  @Test
  public void LaunchBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		KiteLoginPage obj1=new KiteLoginPage(driver);
		obj1.EnterUsername();
		Thread.sleep(1000);
		obj1.EnterPassword();
		obj1.ClickOnLoginButton();

        Thread.sleep(1000);

		KitePinValidationPage obj2 = new KitePinValidationPage(driver);
		obj2.EnterPin();

		Thread.sleep(2000);
		KiteDashboardPage obj3 = new KiteDashboardPage(driver);
		obj3.UserIdValidation();

		 Thread.sleep(1000);
	    String ActualText = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String ExpectedText = "YT2353";

		Assert.assertEquals(ActualText, ExpectedText,"testcase is failed, it is equal");
		Reporter.log("Testcase is passed1", true);

//		Assert.assertNotEquals(ActualText, ExpectedText,"Testcase is equal and failed");
//		Reporter.log("Testcase is not equal passed2",true);

		Assert.fail("Testcase is failed");



  }

}
