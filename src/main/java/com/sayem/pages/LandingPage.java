package com.sayem.pages;


import com.sayem.testcases.TestBase;
import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage{

    WebDriver driver;
    // Constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    // My Account link
    @FindBy(css = Constants.myAccountLink)
    WebElement myAccountLink;

    // Account Dashboard link
    @FindBy(css = Constants.accountDashboardlink)
    WebElement accountDashboardLink;

    // AccountDashboard -> Account Dashboard Page
    public AccountDashboardPage accountDashboard(){
        myAccountLink.click();
        accountDashboardLink.click();
        return PageFactory.initElements(driver, AccountDashboardPage.class);
    }
}
