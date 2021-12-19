package TestNgXMLStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleParellel3 {
  @Test
  public void VisitGoogle() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	    	driver.get("https://www.google.co.in/");
		   Thread.sleep(1000);
  }
}
