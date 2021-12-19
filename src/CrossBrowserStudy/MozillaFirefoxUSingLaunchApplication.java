package CrossBrowserStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MozillaFirefoxUSingLaunchApplication {
  @Test
  public void firfoxmozillaSample1() {
	  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");

	  WebDriver driver = new FirefoxDriver();

	  driver.get("https://www.myntra.com/");
  }
}
