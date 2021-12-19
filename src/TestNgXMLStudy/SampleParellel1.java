package TestNgXMLStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleParellel1 {
  @Test
  public void FbVisit () throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	    	driver.get("https://www.facebook.com/");
		   Thread.sleep(1000);

  }
}
