package org.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium10_Locators {
//    Covered in this class - TestSelenium15 - 25th Feb
    @Description("Verify the Sign-in negative scenario")
    @Test
    public void test_app_vwo_com() throws InterruptedException {

//    Driver Managing
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        // Locators
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password and enter the 1234.
        // Step 3 - Find the Submit and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

//      Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        WebElement Email = driver.findElement(By.id("login-username"));
        Email.sendKeys("Admin@admin.com");
//      Step 2 - Find the Password and enter the 1234.
        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys("1234");
//      Find the Submit and click on the button
        WebElement Button = driver.findElement(By.id("js-login-btn"));
        Button.click();
        Thread.sleep(3000);
//      Verify the message error message
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

//      Adding assertions
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


        driver.quit();
    }
}
