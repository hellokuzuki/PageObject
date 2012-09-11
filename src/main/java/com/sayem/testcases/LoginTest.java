package com.sayem.testcases;


import com.sayem.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


/*
   @Test(enabled = false)  to ignore test

 */
public class LoginTest extends TestBase{
    LandingPage landingPage=null;

    @BeforeSuite
    public void init(){
        initConfigurations();
        initDriver();
    }



    @Test
    public void loginTest(){

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        landingPage = loginPage.doLogin(CONFIG.getProperty("username"), CONFIG.getProperty("password"));
        Assert.assertTrue(landingPage!=null, "Could not login");
        isLoggedIn=true;
        //APPLICATION_LOGS.debug("logged in");
        //APPLICATION_LOGS.debug("In profile page");

        // wrong username/password
        // return type	}

    }


    @Test(dependsOnMethods={"loginTest"})
    public void addNewAddressToAddressBook(){

        landingPage.accountDashboard();
        // LandingPage --> AccountDashboardPage
        AccountDashboardPage accountDashboardPage = landingPage.accountDashboard();

        // AccountDashboardPage --> AddressBookPage
        AddressBookPage addressBookPage = accountDashboardPage.manageAddresses();

        // AddressBookPage --> AddNewAddressPage
        AddNewAddressPage addNewAddressPage = addressBookPage.AddNewAddress();
        addNewAddressPage.addNewAddressBook("Syed","Sayem", "3478789462", "32-48 30th St", "Astoria", "New York", "11106");
    }




}
