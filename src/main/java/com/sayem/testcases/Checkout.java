package com.sayem.testcases;

import com.sayem.pages.checkout.AddToCartPage;
import com.sayem.pages.login.LoginPage;
import com.sayem.pages.sales.LandingPage;
import com.sayem.pages.sales.ProductPage;
import com.sayem.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Checkout extends TestBase{
    @Test
    public void checkout(){
        APPLICATION_LOGS.debug("Executing the Checkout Test");

        if(!TestUtil.isExecutable("Checkout", xls))
            throw new SkipException("Skipping the test");
        LandingPage landingPage =null;
        //go to landing page - if i am logged in else login
        if(!isLoggedIn){
            LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
            landingPage = lp.doLogin(CONFIG.getProperty("username"),CONFIG.getProperty("password"));
        }else{
            landingPage = getTopMenu().goToLandingPage();
        }
        ProductPage productPage = landingPage.selectRandomEvent();
        AddToCartPage addToCartPage = productPage.selectRandomProduct();
        addToCartPage.addItemToTheCart("2");

        APPLICATION_LOGS.debug("Quitting driver");
        quitDriver();
    }
}
