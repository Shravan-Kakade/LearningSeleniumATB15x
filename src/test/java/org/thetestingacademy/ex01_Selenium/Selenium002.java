package org.thetestingacademy.ex01_Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium002 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
//      driver.get("app.vwo.com"); While adding url always need to add 'https://' - url is incomplete without it
        driver.get("https://app.vwo.com");
    }
}
