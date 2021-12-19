package Listener_Study;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test failed,take screenshot",true);

	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("test skipped",true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("Test case successfully",true);
	}

}
