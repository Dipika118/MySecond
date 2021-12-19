package HardAssertStudyTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void samplefornull() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement textbox = driver.findElement(By.id("autocomplete"));
//		System.out.println(textbox.getAttribute("placeholder"));
		Assert.assertNull(textbox, "Textbox is not null");
		Reporter.log("Textbox is  null",true);
		Thread.sleep(1000);
		textbox.sendKeys("india");
	     Assert.assertNotNull(textbox, "Textbox is null");
	     Reporter.log("Textbox is not null",true);




  }
}
