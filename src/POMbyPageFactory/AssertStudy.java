package POMbyPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertStudy {
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

		 Thread.sleep(1000);
//	  String ActualText = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
//		String ExpectedText = "YT2353";
//
//		Assert.assertEquals(ActualText, ExpectedText,"testcase is failed");
//		Reporter.log("Testcase is passed",true);

  }

}
