package com.sayem.testcases;

import com.sayem.pages.login.LoginPage;
import com.sayem.pages.myaccount.AccountDashboardPage;
import com.sayem.pages.myaccount.AddNewAddressPage;
import com.sayem.pages.myaccount.AddressBookPage;
import com.sayem.pages.sales.LandingPage;
import com.sayem.util.TestUtil;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ManageCreditCards extends TestBase{
    @Test
    public void addNewCreditCard(){
        APPLICATION_LOGS.debug("Executing Manage Credit Cards Test");

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
        AccountDashboardPage accountDashboardPage = landingPage.accountDashboard();
        AddressBookPage addressBookPage = accountDashboardPage.manageAddresses();
        AddNewAddressPage addNewAddressPage = addressBookPage.AddNewAddress();

        // Keep this data in the Excel-sheet or something but do not hard-code it here!
        addNewAddressPage.addNewAddressBook("Syed","Sayem", "3478789462", "32-48 30th St", "Astoria", "New York", "11106");

        APPLICATION_LOGS.debug("Quitting driver");
        quitDriver();
    }

    @Test
    public void removeCreditCard(){
        APPLICATION_LOGS.debug("Executing the upload pic test");

        if(!TestUtil.isExecutable("RemoveCreditCard", xls))
            throw new SkipException("Skipping the test");
        LandingPage landingPage =null;
        //go to landing page - if i am logged in else login
        if(!isLoggedIn){
            LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
            landingPage = lp.doLogin(CONFIG.getProperty("username"),CONFIG.getProperty("password"));
        }else{
            landingPage = getTopMenu().goToLandingPage();
        }
        AccountDashboardPage accountDashboardPage = landingPage.accountDashboard();
        AddressBookPage addressBookPage = accountDashboardPage.manageAddresses();
        AddNewAddressPage addNewAddressPage = addressBookPage.AddNewAddress();

        // Keep this data in the Excel-sheet or something but do not hard-code it here!
        addNewAddressPage.addNewAddressBook("Syed","Sayem", "3478789462", "32-48 30th St", "Astoria", "New York", "11106");

        APPLICATION_LOGS.debug("Quitting driver");
        quitDriver();
    }
}
