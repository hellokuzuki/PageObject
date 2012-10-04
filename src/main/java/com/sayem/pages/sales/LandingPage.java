package com.sayem.pages.sales;


import com.sayem.pages.myaccount.AccountDashboardPage;
import com.sayem.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class LandingPage{

    WebDriver driver;
    // Constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    // My Account link
    @FindBy(css = Constants.topMenuMyAccountLink)
    WebElement myAccountLink;

    // Account Dashboard link
    @FindBy(css = Constants.topMenuAccountDashboardLink)
    WebElement accountDashboardLink;



    // AccountDashboard -> Account Dashboard Page
    public AccountDashboardPage accountDashboard(){
        myAccountLink.click();
        accountDashboardLink.click();
        return PageFactory.initElements(driver, AccountDashboardPage.class);
    }


    public void inviteYourFriend(){

    }

    public ProductPage selectRandomEvent(){
        List<WebElement> events = driver.findElements(By.xpath("//*[@id='events-live']/ul/li[not(@style)]/a"));
        Random num = new Random();
        int index=num.nextInt(events.size());
        WebElement menu = events.get(index);
        Actions builder = new Actions(driver);
        builder.moveToElement(menu).build().perform();
        menu.click();
        return PageFactory.initElements(driver, ProductPage.class);
    }
}
