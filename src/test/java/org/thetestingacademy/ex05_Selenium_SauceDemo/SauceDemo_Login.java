package org.thetestingacademy.ex05_Selenium_SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 *   While using cssSelector as a locator for element
 *   tag#id
 *   tag.class
 *   tag[attribute=value]
 *   tag.class[attribute=value]
 */

public class SauceDemo_Login extends BaseClass {

    private static final Logger log = LoggerFactory.getLogger(SauceDemo_Login.class);

    @Test
    public void titleCheck() {
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, "Swag Labs");
    }

    @Test
    public void validLoginTest() {
        WebElement username = driver.findElement(By.cssSelector("input.input_error[placeholder='Username']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.cssSelector("input#password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("input.submit-button"));
        loginButton.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login Failed!!!");
    }

    @Test
    public void invalidLoginTest() {
        WebElement username = driver.findElement(By.cssSelector("input#user-name"));
        username.sendKeys("Vikram");
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("Vedha");
        WebElement loginButton = driver.findElement(By.cssSelector("input#login-button"));
        loginButton.click();
        WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
        String errorMessage = error.getText();
        Assert.assertTrue(errorMessage.contains("Username and password do not match any user in this service"));
    }

    @Test
    public void lockedOutUser() {
        WebElement username = driver.findElement(By.xpath("//input[@data-test='username']"));
        username.sendKeys("locked_out_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertTrue(error.getText().contains("this user has been locked out."));
    }
}
