package SoftAssertStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMbyPageFactory.KiteDashboardPage;
import POMbyPageFactory.KiteLoginPage;
import POMbyPageFactory.KitePinValidationPage;

public class Sample1 {
  @Test
  public void SoftassertMethods() throws InterruptedException {

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
		 String ExpectedText = "YT2312";

     	 SoftAssert soft = new SoftAssert();
//		 soft.assertEquals(ActualText, ExpectedText,"Testcases is failed text is not equal");

		 Reporter.log("Testcases is passed text is equal",true);

		 soft.assertNotEquals(ActualText, ExpectedText,"Testcases is failed text is equal");
		 Reporter.log("Testcases is passed text is not equal",true);

		 soft.assertAll();


  }
}
