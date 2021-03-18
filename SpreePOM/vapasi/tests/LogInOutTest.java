package com.tw.vapasi.tests;
import com.tw.vapasi.spreepages.LoginPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInOutTest extends BaseTest {
    //WebDriverWait wait;
    public String emailID;
    public String password;

    @Test
    public void verifyLoginSuccess(){
        emailID = "meetranjanibe@gmail.com";
        password = "jana@123456";
        String expectedLoginSuccessMsg = "Logged in successfully";
        LoginPage loginPage = new LoginPage(driver); //loginPage.login("meetranjanibe@gmail.com","jana@123456");
        loginPage.login(emailID,password);
        String actualSuccessMsg = loginPage.loginSuccessMessage();
        Assert.assertTrue(loginPage.assertMessage(actualSuccessMsg,expectedLoginSuccessMsg));
    }
    @Test
    public void verifyInvalidLogin() {
        emailID = "meetranjanibe@gmail.com";
        password = "slsflsdf";
        String expectedInvalidLoginMessage = "Invalid email or password.";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(emailID,password);
        String actualMessage = loginPage.loginInvalidMessage();
        Assert.assertTrue(loginPage.assertMessage(actualMessage,expectedInvalidLoginMessage));
    }
    @Test
    public void Logout() {
        emailID = "meetranjanibe@gmail.com";
        password = "jana@123456";
        String expectedLogoutMessage = "Signed out successfully.";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(emailID,password);

        loginPage.logout();
        String actualLogoutMessage = loginPage.logoutSuccessMessage();
        Assert.assertTrue(loginPage.assertMessage(actualLogoutMessage,expectedLogoutMessage));
    }
}
