package com.sayem.testcases;

import com.sayem.pages.sales.BottomMenu;
import com.sayem.pages.sales.TopMenu;
import com.sayem.util.Constants;
import com.sayem.util.Xls_Reader;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TestBase {

    public static Logger APPLICATION_LOGS = null;
    public static Properties CONFIG = null;
    public static WebDriver driver = null;
    public static TopMenu topMenu = null;
    public static BottomMenu bottomMenu = null;
    public static boolean isLoggedIn = false;
    Xls_Reader xls = new Xls_Reader("src/main/java/com/sayem/data/Test Cases.xlsx");


    public void initConfigurations(){
        if(CONFIG == null){
            // Logging
            APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
            // config.prop
            CONFIG = new Properties();
            try {
                FileInputStream fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
                CONFIG.load(fs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void initDriver(){

        // Chrome Driver Path
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");

        // Internet Explorer Path
        File file = new File("IEDriver/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

        if(driver==null){
            if(CONFIG.getProperty("browser").equals("Firefox"))
                driver=new FirefoxDriver();
            else if(CONFIG.getProperty("browser").equals("IE"))
                driver=new InternetExplorerDriver();
            else if(CONFIG.getProperty("browser").equals("Chrome"))
                driver=new ChromeDriver();
        }
    }

    public void quitDriver(){
        driver.quit();
        driver=null;
    }
    public TopMenu getTopMenu(){
        if(topMenu==null){
            topMenu = PageFactory.initElements(driver, TopMenu.class);
        }
        return topMenu;
    }

    public BottomMenu getBottomMenu(){
        if(bottomMenu==null){
            bottomMenu = PageFactory.initElements(driver, BottomMenu.class);
        }
        return bottomMenu;
    }

}
