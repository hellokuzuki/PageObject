package com.sayem.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDashboardPage {

    // Manage Address
    @FindBy(xpath = "//*[@id='mainContent']/div[1]/div[3]/div/div[3]/h3/a")
    WebElement manageAddressLink;


    public void viewAll(){

    }

    public void manageAddressButton(){
        manageAddressLink.click();

    }

    public void billingAddressEditButton(){

    }

    public void shippingAddressEdiButton(){

    }


    public void contactInformationEditButton(){

    }


    public void newsLetterManagementEditButton(){

    }

}
