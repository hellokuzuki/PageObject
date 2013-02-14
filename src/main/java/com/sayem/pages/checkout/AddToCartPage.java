package com.sayem.pages.checkout;

import com.sayem.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    // Checkout button
    @FindBy(css = Constants.addToCartPage_checkoutButton)
    WebElement addToCartPage_checkoutButton;

    public ShoppingCartPage addItemToTheCart(String addToCartPage_qty){
        try {
            selectRandomSize();
        } catch (Exception e) {
            System.out.println("Element is not found");
        }
        try {
            this.addToCartPage_qty.clear();
            this.addToCartPage_qty.sendKeys(addToCartPage_qty);
        } catch (Exception e) {
            System.out.println("Element is not found");
        }
        try {
            this.addToCartPage_button.click();
        } catch (Exception e) {
            System.out.println("Element is not found");
        }

        try {
            this.addToCartPage_checkoutButton.click();
        } catch (Exception e) {
            System.out.println("Element is not found");
        }


        return PageFactory.initElements(driver, ShoppingCartPage.class);
    }

    public void selectRandomSize(){
        WebElement size = driver.findElement(By.xpath("//*[@id='attribute169']"));
        List<WebElement> selectSize = size.findElements(By.tagName("option"));
        selectSize.get(1).click();
    }
}
