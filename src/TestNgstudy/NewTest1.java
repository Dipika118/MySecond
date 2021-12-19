package TestNgstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void Test() throws InterruptedException {
//	  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://kite.zerodha.com/");
//		driver.manage().window().maximize();

		Reporter.log("TestCase is passed",true);
  }
		@Test
		public void Test1()
		{
			System.out.println("I am Testcase Seconds");
		}

		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("I am After method");
		}

		@BeforeMethod
		public void BeforeMethod()
		{
			System.out.println("I am Before Method");
		}

}
