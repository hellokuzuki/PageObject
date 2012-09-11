package com.sayem.pages;


import com.sayem.testcases.TestBase;
import com.sayem.util.Constants;
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

    }

}
