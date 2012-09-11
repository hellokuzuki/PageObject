package com.sayem.pages;


import com.sayem.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDashboardPage{

    WebDriver driver;
    public AccountDashboardPage(WebDriver driver){
        this.driver = driver;
    }

    // Manage Address
    @FindBy(xpath = Constants.manageAddressLink)
    WebElement manageAddressLink;


    public AddressBookPage manageAddresses(){
        manageAddressLink.click();
        return PageFactory.initElements(driver, AddressBookPage.class);

        /* By default PageFactory.InitElements() returns void. But you can do something like this.
        AddressBookPage addressBookPage = new AddressBookPage(driver);
        PageFactory.initElements(driver, addressBookPage);
        return addressBookPage;
        */
    }
        // OR you can do something like this!!
    /*
    // Locators
    By manageAddressLink = By.xpath(Constants.manageAddressLink);

    // Public methods for page object
    public AddressBookPage manageAddresses() {
        WebElement manageAddresses = driver.findElement(manageAddressLink);
        manageAddresses.click();
        return new AddressBookPage(driver);
    }
    */
}
