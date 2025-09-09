package aqa_hw_7.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("---Test with name " + result.getName() + " is starting");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("---Test " + result.getName() + " successfully finished with result " + result.getStatus());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("---Test <" + result.getName() + "> is failed with result " + result.getStatus());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("---Test <" + result.getName() + "> is skipped with result " + result.getStatus());
    }
}