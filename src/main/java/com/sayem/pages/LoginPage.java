package com.sayem.pages;


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
    @FindBy(css = Constants.email)
    WebElement email;

    // Password
    @FindBy(css = Constants.password)
    WebElement password;

    // Sign In Button
    @FindBy(css = Constants.signInButton)
    WebElement signInButton;

    // Login --> LandingPage
    public LandingPage doLogin(String email, String password){
        driver.get("http://totsy.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.signInButton.click();

        // LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
        // return landingPage;
        // or
        return PageFactory.initElements(driver, LandingPage.class);
    }


}
