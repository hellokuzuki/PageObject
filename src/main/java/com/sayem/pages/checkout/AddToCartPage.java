package com.sayem.pages.checkout;

import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    WebDriver driver;
    public AddToCartPage(WebDriver driver){
        this.driver = driver;
    }

    // Select Size
    @FindBy(css = Constants.addToCartPage_size)
    WebElement addToCartPage_size;

    // Select Color
    @FindBy(css = Constants.addToCartPage_color)
    WebElement addToCartPage_color;

    // Enter Qty
    @FindBy(css = Constants.addToCartPage_qty)
    WebElement addToCartPage_qty;

    // Add to cart button
    @FindBy(css = Constants.addToCartPage_button)
    WebElement addToCartPage_button;


    public ShoppingCartPage addItemToTheCart(String addToCartPage_button,
                                 String addToCartPage_color,
                                 String addToCartPage_qty){

        this.addToCartPage_button.sendKeys();
        this.addToCartPage_color.sendKeys();
        this.addToCartPage_qty.sendKeys();
        this.addToCartPage_button.click();
        return PageFactory.initElements(driver, ShoppingCartPage.class);
    }
}
