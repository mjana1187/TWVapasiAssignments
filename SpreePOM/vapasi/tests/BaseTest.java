package com.tw.vapasi.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Listener.class)

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
        public void setDriver(ITestContext testContext) {
        //System.setProperty("webdriver.chrome.driver","/src/test/java/com/tw/vapasi/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/janaranjanimadhanagopal/Desktop/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        testContext.setAttribute("WebDriver",this.driver);
        driver.manage().deleteAllCookies();
    }

    @BeforeMethod
        public void setUrl() {
        driver.manage().deleteAllCookies();
        driver.get("https://spree-vapasi.herokuapp.com/");
    }
    @AfterClass
        public void tearDown(){
        driver.quit();
    }

    private static void waitForPageToLoad(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
    }
}
