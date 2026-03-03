package org.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11_LinkText_Partial_Text_TagName_Locators {
    @Description("")
    @Test
    public void test_login_vwo(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
//        Here Element is found using full text present for the link in the DOM file
//        WebElement Trial = driver.findElement(By.linkText("Start a free trial"));


//      Here Element is found using partial text present for the link in the DOM file
        WebElement Trial = driver.findElement(By.partialLinkText("Start a"));
//        Clicking on the element
        Trial.click();

        driver.quit();
    }
}
