package Listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener, ISuiteListener{

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onStart(suite);
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		//ISuiteListener.super.onFinish(suite);
	}

	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test started " +result.getName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test completed " +result.getName());
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test failed " +result.getName());
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test skipped " +result.getName());
	}

	public void onStart(ITestContext context) 
	{
		System.out.println("Test completed " +context.getName());
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("Test finished " +context.getName());
	}

}
