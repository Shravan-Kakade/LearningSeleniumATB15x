package org.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium12_Mini_Project2_TagName {
    @Owner("Shravan")
    @Description("Verify the error message given after entering invalid email ID")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void free_trial_Verify(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial");
        driver.manage().window().maximize();
//        Verify that the link contains "free-trial"
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("free-trial"));

//        Enter invalid email ID in email textbox
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");
//        Check the consent checkbox on webpage
        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();
//        Click on create a Free Trial Account
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");
        driver.quit();
    }
}
