package com.sayem.pages.myaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddressBookPage{

    WebDriver driver;
    public AddressBookPage(WebDriver driver){
        this.driver = driver;
    }

    // Add New Address
    @FindBy(css = ".button.btn.btn-primary.pull-right")
    WebElement addNewAddressLink;

    public AddNewAddressPage AddNewAddress(){
        addNewAddressLink.click();
        return PageFactory.initElements(driver, AddNewAddressPage.class);
    }

}
