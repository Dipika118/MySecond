package TestNgstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsStudy {
  @Test(dependsOnMethods = {"b"})
  public void a() {

	  Reporter.log("TC a is running", true);
  }
  @Test(timeOut = 1000)
  public void b() throws InterruptedException {

	  Thread.sleep(2000);
	  Reporter.log("TC b is running", true);
  }
  @Test
  public void c() {
	  Reporter.log("TC c is running", true);
  }
}
