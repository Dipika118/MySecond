package TestNgstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordCombination {
  @Test(priority = -2,dependsOnMethods = {"b"})
  public void a() {
	  Reporter.log("TC a is running", true);
  }
  @Test(priority = 1, enabled = false)
  public void b()
  {
	  Reporter.log("TC b is running", true);
  }
  @Test(priority = -1)
  public void c()
  {
	  Reporter.log("TC c is running", true);
  }
}
