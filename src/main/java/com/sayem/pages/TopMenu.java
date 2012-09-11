package com.sayem.pages;


import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenu{

    WebDriver driver;
    // Constructor
    public TopMenu(WebDriver driver){
        this.driver = driver;
    }

    // My Account
    @FindBy(css = Constants.myAccountLink)
    WebElement myAccountLink;

    // Logout
    @FindBy(css = Constants.logoutLink)
    WebElement logoutLink;


    public void logout(){
        myAccountLink.click();
        logoutLink.click();

    }

    public void totsyLogo(){

    }


}
