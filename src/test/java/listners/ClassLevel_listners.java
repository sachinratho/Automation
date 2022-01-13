package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ClassLevel_listners implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		System.out.println(" test case started successfully");
		
	}


	public void onTestSuccess(ITestResult result) {
	System.out.println("test case is passed succesfully" + result);
		
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failed  " + result);
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test case  is skipped" + result);
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
		System.out.println("testing is started" + context);
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("testing is finished" + context);
	}

}
