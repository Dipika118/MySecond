package HardAssertStudyTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertSelected {
  @Test
  public void TC1AssertEqualas() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 WebElement Checkbox = driver.findElement(By.id("checkBoxOption1"));

		Assert.assertFalse(Checkbox.isSelected(),"Checkbox is selected");
		Reporter.log("Checkbox is not selected",true);

		Checkbox.click();
		Assert.assertTrue(Checkbox.isSelected(),"Checkbox is not selected");
		Reporter.log("Checkbox is selected",true);






  }
}
