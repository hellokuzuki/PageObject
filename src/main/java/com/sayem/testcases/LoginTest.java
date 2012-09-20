package com.sayem.testcases;

import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import com.sayem.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;


public class LoginTest extends TestBase{
    LandingPage landingPage=null;

    @BeforeSuite
    public void init(){
        initConfigurations();
        initDriver();
    }

    @Test(dataProvider="getLoginData")
    public void loginTest(Hashtable<String,String> data){
        if(!TestUtil.isExecutable("LoginTest", xls) || data.get("Runmode").equals("N"))
            throw new SkipException("Skipping the test");

        System.out.println("************************************************");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        landingPage = loginPage.doLogin(CONFIG.getProperty("username"), CONFIG.getProperty("password"));
        Assert.assertTrue(landingPage!=null, "Could not login");
        isLoggedIn=true;
    }

    @DataProvider
    public Object[][] getLoginData(){
        return TestUtil.getData("LoginTest", xls);
    }

}
