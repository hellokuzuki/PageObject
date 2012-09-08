package com.sayem.pages;


import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    // My Account link
    @FindBy(css = Constants.myAccountLink)
    WebElement myAccountLink;

    // Account Dashboard link
    @FindBy(css = Constants.accountDashboardlink)
    WebElement accountDashboardLink;

    // Constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }


    // AccountDashboard -> Account Dashboard Page
    public AccountDashboardPage accountDashboard(){
        myAccountLink.click();
        accountDashboardLink.click();
        return PageFactory.initElements(driver, AccountDashboardPage.class);
    }
}
