package com.tw.vapasi.tests;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        String testMethodName=iTestResult.getMethod().getMethodName();
        System.out.println("Test passed: "+testMethodName);
        try {
            getScreenshotPath(testMethodName,iTestResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult){
        String testMethodName=iTestResult.getMethod().getMethodName();
        System.out.println("Test Failed: "+testMethodName);
        try {
            getScreenshotPath(testMethodName,iTestResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getScreenshotPath(String testCaseName,ITestResult iTestResult) throws IOException {
        WebDriver driver = (WebDriver) iTestResult.getTestContext().getAttribute("WebDriver");
        Date date=new Date();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("/Users/janaranjanimadhanagopal/IdeaProjects/SpreePOM/src/screenshot/"
                + date +"_"+testCaseName +".png");
        Files.copy(srcFile, destFile);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }



    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}