package POM_Test_Base_properties;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	WebDriver driver;

	public void InitialiseBrowser() throws InterruptedException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		 ChromeOptions opt= new ChromeOptions();
		 opt.addArguments("Disable-notification");
		    driver = new ChromeDriver(opt);
		    driver.get(Utility.gettingdatafromProperties("URL"));
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
	}

}
