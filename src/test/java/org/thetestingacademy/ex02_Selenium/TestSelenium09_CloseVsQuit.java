package org.thetestingacademy.ex02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium09_CloseVsQuit {
    @Test
    public void TestSelenium01() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");
        Thread.sleep(3000);
        driver.close();     // This command only closes the current tab

//        driver.get("https://demoqa.com/");    If user tries to access another url after closing browser session, it'll throw
//                                    NoSuchWindowException. -- THIS CANNOT BE DONE
//        driver.quit();      // This command closes whole browser session
    }
}
