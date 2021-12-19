package KiteZerodhaApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMbyPageFactory.KiteDashboardPage;
import POMbyPageFactory.KiteLoginPage;
import POMbyPageFactory.KitePinValidationPage;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {

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

		KiteDashboardPage obj3 = new KiteDashboardPage(driver);
		Thread.sleep(1000);
	    obj3.UserIdValidation();




	}

}
