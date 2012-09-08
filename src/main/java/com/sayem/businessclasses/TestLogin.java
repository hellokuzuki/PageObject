package com.sayem.businessclasses;


import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestLogin {

    public static void main(String [] args){
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        LandingPage landingPage = loginPage.doLogin("syed@hotmail.com", "sami3092");
        landingPage.accountDashboard();

    }
}
