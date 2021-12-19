package TestNgXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {
  @Test(groups = {"sanity"})
  public void S4TC1() {
	  Reporter.log("TC2 is running", true);
  }
  @Test(groups = {"Regression"})
  public void S4TC2() {
	  Reporter.log("TC2 is running", true);
  }
  @Test(groups = {"sanity"})
  public void S4TC3() {
	  Reporter.log("TC3 is running", true);
  }
  @Test(groups = {"Regression"})
  public void S4TC4() {
	  Reporter.log("TC4 is running", true);
  }
  @Test
  public void S4TC5() {
	  Reporter.log("TC5 is running", true);
  }
}
