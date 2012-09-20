package com.sayem.testcases;

import com.sayem.pages.*;
import com.sayem.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddNewAddress extends TestBase{
    @Test
    public void AddressBook(){
        APPLICATION_LOGS.debug("Executing the upload pic test");

        if(!TestUtil.isExecutable("addNewAddress", xls))
            throw new SkipException("Skipping the test");


        LandingPage landingPage =null;
        //go to landing page - if i am logged in else login
        if(!isLoggedIn){
            LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
            landingPage = lp.doLogin(CONFIG.getProperty("username"),CONFIG.getProperty("password"));
        }else{
            landingPage = getTopMenu().goToLandingPage();
        }

        // LandingPage --> AccountDashboardPage
        AccountDashboardPage accountDashboardPage = landingPage.accountDashboard();

        // AccountDashboardPage --> AddressBookPage
        AddressBookPage addressBookPage = accountDashboardPage.manageAddresses();

        // AddressBookPage --> AddNewAddressPage
        AddNewAddressPage addNewAddressPage = addressBookPage.AddNewAddress();
        addNewAddressPage.addNewAddressBook("Syed","Sayem", "3478789462", "32-48 30th St", "Astoria", "New York", "11106");

        // change PIC
/*
        APPLICATION_LOGS.debug("Quitting driver");
        try{
            Assert.assertTrue(false, "xxxx");
        }catch(Throwable e){
            ErrorUtil.addVerificationFailure(e);
            TestUtil.takeScreenShot("upload");
            return;
        }
*/

        quitDriver();
    }
}
