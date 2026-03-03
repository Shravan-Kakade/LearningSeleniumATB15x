package org.thetestingacademy.ex02_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium01 {
    public static void main(String[] args) {
//        covered in this class - TestSelenium03 - 20th Feb

    //  Selenium 3 - In Selenium 3, driver needed to be downloaded then give path of the driver in the program

    //  System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        FirefoxDriver driver = new FirefoxDriver();
        //  new FirefoxDriver(); - This START of the Selenium Session
        //  Sesion - Fresh copy of browser is started!.
        //  POST request to the Server - Firefox Driver.

        driver.get("https://sdet.live");
        // Commmand number 2 - POST request to give to the driver to navigate to a URL
    }
}
