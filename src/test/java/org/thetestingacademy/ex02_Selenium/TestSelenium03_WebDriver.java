package org.thetestingacademy.ex02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium03_WebDriver {
//    Covered in this class - TestSelenium05_WebDriver - 20th Feb
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://app.vwo.com");
        driver.quit();

    }
}
