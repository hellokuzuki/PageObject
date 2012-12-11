package com.sayem.pages.myaccount;


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
    @FindBy(css = "#firstname")
    public WebElement firstName;

    // Last Name
    @FindBy(css = "#lastname")
    WebElement lastName;

    // Telephone
    @FindBy(css = "#telephone")
    WebElement telephone;

    // Street Address
    @FindBy(css = "#street_1")
    WebElement streetAddress;

    // City
    @FindBy(css = "#city")
    WebElement city;

    // State
    @FindBy(css = "#region_id")
    WebElement state;

    // Zip Code
    @FindBy(css = "#zip")
    WebElement zipCode;

    // Save Address
    @FindBy(css = ".button.btn.btn-primary")
    WebElement saveAddressButton;



    private void click(String valuesomething){
        streetAddress.click();
    }

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
