package com.sayem.testcases;

import com.sayem.pages.sales.LandingPage;
import com.sayem.pages.login.LoginPage;
import com.sayem.pages.login.RegistrationPage;
import com.sayem.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Registration extends TestBase{
    @Test
    public void register(){
        APPLICATION_LOGS.debug("Executing Registration Test");

        if(!TestUtil.isExecutable("Registration", xls))
            throw new SkipException("Skipping the test");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        RegistrationPage registrationPage = loginPage.register();
        LandingPage landingPage = registrationPage.registration("ssayem+gg3@totsy.com", "sami3092", "sami3092", "ssayem+900@totsy.com");


        APPLICATION_LOGS.debug("Quitting driver");
        quitDriver();
    }
}
