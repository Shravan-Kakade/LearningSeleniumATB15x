package org.thetestingacademy.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_Practise {
//    TestNG annotation @Test is used here, it reduces need of main method, class can be run directly
//    Or multiple classes can be run at once using testng.xml file created
    @Test
    public void app_vwo_login_name_and_id() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
//        Locator - Name
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("abc@xyz.com");
//        Locator - ID
        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("passkey");
//        Locator - ID
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();
    }
}
