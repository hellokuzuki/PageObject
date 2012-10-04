package com.sayem.pages.myaccount;


import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressPage{

    WebDriver driver;
    // Constructor
    public AddNewAddressPage(WebDriver driver){
        this.driver = driver;
    }

    // First Name
    @FindBy(xpath = Constants.checkoutPage_billing_firstName)
    WebElement firstName;

    // Last Name
    @FindBy(xpath = Constants.checkoutPage_billing_lastName)
    WebElement lastName;

    // Telephone
    @FindBy(xpath = Constants.checkoutPage_billing_phone)
    WebElement telephone;

    // Street Address
    @FindBy(xpath = Constants.checkoutPage_billing_address1)
    WebElement streetAddress;

    // City
    @FindBy(xpath = Constants.checkoutPage_billing_city)
    WebElement city;

    // State
    @FindBy(xpath = Constants.checkoutPage_billing_state)
    WebElement state;

    // Zip Code
    @FindBy(xpath = Constants.checkoutPage_billing_zipCode)
    WebElement zipCode;

    // Save Address
    @FindBy(xpath = Constants.checkoutPage_billing_shipThisToAddress)
    WebElement saveAddressButton;





    public void addNewAddressBook(String firstName,
                                  String lastName,
                                  String telephone,
                                  String streetAddress,
                                  String city,
                                  String state,
                                  String zipCode){

        this.firstName.clear();
        this.firstName.sendKeys(firstName);
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
        this.telephone.sendKeys(telephone);
        this.streetAddress.sendKeys(streetAddress);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
        this.saveAddressButton.click();




    }


}
