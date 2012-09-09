package com.sayem.pages;


import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewAddressPage {

    WebDriver driver;

    public AddNewAddressPage(WebDriver driver){
        this.driver = driver;
    }

    // First Name
    @FindBy(css = Constants.firstName)
    WebElement firstName;

    // Last Name
    @FindBy(css = Constants.lastName)
    WebElement lastName;

    // Telephone
    @FindBy(css = Constants.telephone)
    WebElement telephone;

    // Street Address
    @FindBy(css = Constants.streetAddress)
    WebElement streetAddress;

    // City
    @FindBy(css = Constants.city)
    WebElement city;

    // State
    @FindBy(css = Constants.state)
    WebElement state;

    // Zip Code
    @FindBy(css = Constants.zipCode)
    WebElement zipCode;

    // Save Address
    @FindBy(css = Constants.saveAddressButton)
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
