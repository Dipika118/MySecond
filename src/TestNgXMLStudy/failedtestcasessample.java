package TestNgXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedtestcasessample {
	 @Test
	  public void tC1() {
		  Reporter.log("tc1 is running...",true);
	  }
	  @Test(timeOut = 1000)
	  public void tC2() throws InterruptedException {
		  Thread.sleep(500);
		  Reporter.log("tc2 is running...",true);
	  }
	  @Test
	  public void tC3() {
		  Reporter.log("tc3 is running...",true);
	  }
	  @Test
	  public void tC4() {

		  Reporter.log("tc4 is running...",true);
	  }
}
