package com.sayem.pages;


import com.sayem.testcases.TestBase;
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
    @FindBy(xpath = Constants.firstName)
    WebElement firstName;

    // Last Name
    @FindBy(xpath = Constants.lastName)
    WebElement lastName;

    // Telephone
    @FindBy(xpath = Constants.telephone)
    WebElement telephone;

    // Street Address
    @FindBy(xpath = Constants.streetAddress)
    WebElement streetAddress;

    // City
    @FindBy(xpath = Constants.city)
    WebElement city;

    // State
    @FindBy(xpath = Constants.state)
    WebElement state;

    // Zip Code
    @FindBy(xpath = Constants.zipCode)
    WebElement zipCode;

    // Save Address
    @FindBy(xpath = Constants.saveAddressButton)
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
