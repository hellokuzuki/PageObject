package com.sayem.pages.login;


import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ResetPasswordPage {

    WebDriver driver;
    public ResetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    // Email Address
    @FindBy(css = Constants.resetPasswordPage_Email)
    WebElement resetPasswordPage_Email;

    // Reset Password Button
    @FindBy(css = Constants.resetPasswordPage_Button)
    WebElement resetPasswordPage_Button;

    public void resetPassword (String resetPasswordPage_Email){
        this.resetPasswordPage_Email.sendKeys(resetPasswordPage_Email);
        resetPasswordPage_Button.click();
    }

}
