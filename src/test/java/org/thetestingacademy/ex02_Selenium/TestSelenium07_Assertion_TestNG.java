package org.thetestingacademy.ex02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium07_Assertion_TestNG {
    @Test
    public void Test_selenium_01() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/");
        driver.quit();
    }

    @Test
    public void Test_Selenium_02(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com/");
        Assert.assertEquals(driver.getTitle(),"demosite");
        driver.quit();
    }
}
