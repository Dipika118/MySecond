package TestNgXMLStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleParellel2 {
  @Test
  public void VisitVCTC() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	    	driver.get("https://vctcpune.com/");
		   Thread.sleep(1000);
  }
}
