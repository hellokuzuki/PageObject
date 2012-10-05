package com.sayem.pages.login;


import com.sayem.pages.sales.LandingPage;
import com.sayem.testcases.TestBase;
import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class LoginPage{

    WebDriver driver;
    // Constructor
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    // Email Address
    @FindBy(css = Constants.loginPage_EmailAddress)
    WebElement loginPage_EmailAddress;

    // Password
    @FindBy(css = Constants.loginPage_Password)
    WebElement loginPage_Password;

    // Sign In Button
    @FindBy(css = Constants.loginpage_SignInButton)
    WebElement loginpage_SignInButton;

    // Reset Password
    @FindBy(css = Constants.LoginPage_ForgotYourPassword)
    WebElement LoginPage_ForgotYourPassword;

    // Sign up button
    @FindBy(css = Constants.loginPage_SignUpLink)
    WebElement loginPage_SignUpLink;



    // Login --> LandingPage
    public LandingPage doLogin(String email, String password){
        driver.get(TestBase.CONFIG.getProperty("testsiteBaseURL"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.loginPage_EmailAddress.sendKeys(email);
        this.loginPage_Password.sendKeys(password);
        this.loginpage_SignInButton.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }

    public ResetPasswordPage resetPassword(){
        driver.get(TestBase.CONFIG.getProperty("testsiteBaseURL"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage_ForgotYourPassword.click();
        return PageFactory.initElements(driver, ResetPasswordPage.class);
    }

    public RegistrationPage register(){
        driver.get(TestBase.CONFIG.getProperty("testsiteBaseURL"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage_SignUpLink.click();
        return PageFactory.initElements(driver, RegistrationPage.class);
    }

}



