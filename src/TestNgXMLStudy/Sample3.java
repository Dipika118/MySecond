package TestNgXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
  @Test(groups = {"Regression"})
  public void S3TC1() {
	  Reporter.log("TC2 is running", true);
  }
  @Test(groups = {"sanity"})
  public void S3TC2() {
	  Reporter.log("TC2 is running", true);
  }
  @Test(groups = {"Regression"})
  public void S3TC3() {
	  Reporter.log("TC3 is running", true);
  }
  @Test(groups = {"sanity"})
  public void S3TC4() {
	  Reporter.log("TC4 is running", true);
  }
  @Test
  public void S3TC5() {
	  Reporter.log("TC5 is running", true);
  }
}
