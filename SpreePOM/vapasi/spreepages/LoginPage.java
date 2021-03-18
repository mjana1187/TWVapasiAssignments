package com.tw.vapasi.spreepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    @FindBy(id="spree_user_email")
        WebElement userEmail;
    @FindBy(id="spree_user_password")
        WebElement userPassword;
    @FindBy(css="input[name ='commit']")
        WebElement submitLoginButton;
    @FindBy(id = "link-to-login")
        WebElement checkLoginButton;
    @FindBy(xpath = "//*[text()='Logged in successfully']")
        WebElement loginSuccessMessage;
    @FindBy(xpath = "//*[text()='Invalid email or password.']")
        WebElement loginInvalidMessage;
    @FindBy(xpath = "//a[contains(text(),'Logout')]")  //@FindBy(partialLinkText = "Logout")
        WebElement submitLogoutButton;
    @FindBy(xpath = "//*[text()='Signed out successfully.']")
        WebElement logoutSuccessMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String emailId, String pwd) {
        checkLoginButton.click();
        userEmail.sendKeys(emailId);
        userPassword.sendKeys(pwd);
        submitLoginButton.click();
    }
    public String loginSuccessMessage(){
        String loginSuccessMessageText = loginSuccessMessage.getText();
        System.out.println(loginSuccessMessageText);
        return loginSuccessMessageText;
    }

    public String loginInvalidMessage(){
        String loginInvalidMessageText = loginInvalidMessage.getText();
        System.out.println(loginInvalidMessageText);
        return loginInvalidMessageText;
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(submitLogoutButton));
        wait = new WebDriverWait(driver, 100);
        submitLogoutButton.click();
    }

    public String logoutSuccessMessage(){
        String logoutSuccessMessageText = logoutSuccessMessage.getText();
        return logoutSuccessMessageText;
    }

    public boolean assertMessage(String message, String actualMessage)
    {
        if(message.equalsIgnoreCase(actualMessage))
            return true;
        else
            return false;
    }
}