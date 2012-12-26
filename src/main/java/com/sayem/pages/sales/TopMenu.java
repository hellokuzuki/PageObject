package com.sayem.pages.sales;


import com.sayem.pages.sales.LandingPage;
import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu{

    WebDriver driver;
    // Constructor
    public TopMenu(WebDriver driver){
        this.driver = driver;
    }

    // My Account
    @FindBy(css = Constants.topMenuMyAccountLink)
    WebElement myAccountLink;

    // Logout
    @FindBy(css = Constants.topMenuLogOutLink)
    WebElement logoutLink;

    // Totsy Logo
    @FindBy(css = Constants.topMenuTotsyLogo)
    WebElement totsyLogo;



    public void logout(){
        myAccountLink.click();
        logoutLink.click();

    }

    public LandingPage goToLandingPage(){
        totsyLogo.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }


}
