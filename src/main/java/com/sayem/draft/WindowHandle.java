package com.sayem.draft;

import mx4j.tools.config.DefaultConfigurationBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    public static void main(String [] args){

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("http://www.totsy.com");
        driver.findElement(By.cssSelector(".page-header>h2>small>a")).click();
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ssayemgg5@totsy.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("sami3092");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("sami3092");
        driver.findElement(By.cssSelector("#submit-button")).click();

        // get current window
        driver.getWindowHandles().iterator().next();
        // do what you want in other window

        driver.findElement(By.cssSelector("#contact_list")).sendKeys("ssayem+201@gmail.com");
        driver.findElement(By.cssSelector(".button.btn.btn-primary.pull-right")).click();








    }
}
