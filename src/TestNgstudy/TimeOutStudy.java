package TestNgstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy {
  @Test
  public void a() {

	  Reporter.log("TC a is running", true);
  }
  @Test(timeOut = 8000)
  public void b() throws InterruptedException {

	  Thread.sleep(1000);
	  Reporter.log("TC b is running", true);
  }
  @Test
  public void c() {

	  Reporter.log("TC c is running", true);
  }
  @Test
  public void d() {

	  Reporter.log("TC d is running", true);
  }
}
