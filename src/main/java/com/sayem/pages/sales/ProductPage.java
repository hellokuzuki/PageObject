package com.sayem.pages.sales;

import com.sayem.pages.checkout.AddToCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class ProductPage {

    WebDriver driver;
    // Constructor
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public AddToCartPage selectRandomProduct(){
        List<WebElement> items = driver.findElements(By.cssSelector(".thumbnail"));
        Random num = new Random();
        int index=num.nextInt(items.size());
        items.get(index).click();
        return PageFactory.initElements(driver, AddToCartPage.class);
    }
}
