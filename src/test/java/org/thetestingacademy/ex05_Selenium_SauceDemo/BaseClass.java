package org.thetestingacademy.ex05_Selenium_SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    protected WebDriver driver;
    @BeforeMethod
    public void launchBrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
