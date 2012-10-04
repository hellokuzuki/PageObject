package com.sayem.pages;

import com.sayem.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    // Email Address
    @FindBy(css = Constants.signupPage_EmailAddress)
    WebElement signupPage_EmailAddress;

    // Email Address
    @FindBy(css = Constants.signupPage_Password)
    WebElement signupPage_Password;

    // Email Address
    @FindBy(css = Constants.signupPage_CofirmPassword)
    WebElement signupPage_CofirmPassword;

    // Reset Password Button
    @FindBy(css = Constants.SendInvitationFriendPopUp)
    WebElement SendInvitationFriendPopUp;

    // Invite your Friend
    @FindBy(css = Constants.sendInvitationPopUpButton)
    WebElement sendInvitationPopUpButton;

    // Submit Button
    @FindBy(css = Constants.signupPage_Button)
    WebElement signupPage_Button;

    public LandingPage registration (String signupPage_EmailAddress,
                                      String signupPage_Password,
                                      String signupPage_CofirmPassword,
                                      String SendInvitationFriendPopUp){

        this.signupPage_EmailAddress.sendKeys(signupPage_EmailAddress);
        this.signupPage_Password.sendKeys(signupPage_Password);
        this.signupPage_CofirmPassword.sendKeys(signupPage_CofirmPassword);
        signupPage_Button.click();

        driver.getWindowHandles().iterator().next();
        this.SendInvitationFriendPopUp.sendKeys(SendInvitationFriendPopUp);
        sendInvitationPopUpButton.click();

        return PageFactory.initElements(driver, LandingPage.class);
    }
}
