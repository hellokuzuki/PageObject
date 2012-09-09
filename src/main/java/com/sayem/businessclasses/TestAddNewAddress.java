package com.sayem.businessclasses;


import com.sayem.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestAddNewAddress {

    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // LoginPage
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        // LoginPage --> LandingPage
        LandingPage landingPage = loginPage.doLogin("syed@hotmail.com", "sami3092");

        // LandingPage --> AccountDashboardPage
        AccountDashboardPage accountDashboardPage = landingPage.accountDashboard();

        // AccountDashboardPage --> AddressBookPage
        AddressBookPage addressBookPage = accountDashboardPage.manageAddresses();

        // AddressBookPage --> AddNewAddressPage
        AddNewAddressPage addNewAddressPage = addressBookPage.AddNewAddress();
        addNewAddressPage.addNewAddressBook("Syed","Sayem", "3478789462", "32-48 30th St", "Astoria", "New York", "11106");

    }

}