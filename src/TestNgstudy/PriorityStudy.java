package TestNgstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy {
  @Test
  public void b() {

	  Reporter.log("TC b is running", true);
  }
  @Test
  public void a() {

	  Reporter.log("TC a is running", true);
  }
  @Test(priority = 1)
  public void d() {

	  Reporter.log("TC d is running", true);
  }
  @Test(priority = -1)
  public void c() {

	  Reporter.log("TC c is running", true);
  }
  @Test
  public void e() {

	  Reporter.log("TC e is running", true);
  }
}
