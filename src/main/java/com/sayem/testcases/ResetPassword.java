package com.sayem.testcases;

import com.sayem.pages.login.LoginPage;
import com.sayem.pages.login.ResetPasswordPage;
import com.sayem.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ResetPassword extends TestBase{
    @Test
    public void resetPassword(){
        APPLICATION_LOGS.debug("Executing password reset test");

        if(!TestUtil.isExecutable("ResetPassword", xls))
            throw new SkipException("Skipping the test");

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        ResetPasswordPage resetPasswordPage = loginPage.resetPassword();
        resetPasswordPage.resetPassword("ssayem+s@totsy.com");

        APPLICATION_LOGS.debug("Quitting driver");
        quitDriver();
    }
}
