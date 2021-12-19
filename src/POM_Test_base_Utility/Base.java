package POM_Test_base_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	WebDriver driver;

	public void InitialiseBrowser() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		 ChromeOptions opt= new ChromeOptions();
		 opt.addArguments("Disable-notification");
		    driver = new ChromeDriver(opt);
		    driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
	}

}
