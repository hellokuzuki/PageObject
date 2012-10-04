package com.sayem.pages.checkout;

import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    WebDriver driver;
    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    // Proceed to checkout
    @FindBy(css = Constants.addToCartPage_button)
    WebElement addToCartPage_button;


    public CheckoutPage proceedToCheckout(String addToCartPage_button){

        return PageFactory.initElements(driver, CheckoutPage.class);
    }
}
