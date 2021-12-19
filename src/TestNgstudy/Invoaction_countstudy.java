package TestNgstudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Invoaction_countstudy {
  @Test (invocationCount = 3)
  public void TC1() {


	  Reporter.log("Tc1 is passed", true);
  }
  @BeforeMethod
  public void beforeMethod() {

	  Reporter.log("Before Method is running", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method is running", true);
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
