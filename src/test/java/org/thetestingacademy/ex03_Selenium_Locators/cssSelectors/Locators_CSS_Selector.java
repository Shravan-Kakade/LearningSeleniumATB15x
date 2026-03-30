package org.thetestingacademy.ex03_Selenium_Locators.cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_CSS_Selector {
    @Test
    public void cssselectors() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();

//  Selector used - linkText
        WebElement textbox = driver.findElement(By.linkText("Text Box"));
        textbox.click();

//  CSS Selector - tag,id - tag#id
        WebElement fullname = driver.findElement(By.cssSelector("input#userName"));
        fullname.sendKeys("Vikram Vedha");

//  CSS Selector - tag,attribute - tag[attribute='value']
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
        email.sendKeys("vedha@vikram.com");

//  CSS Selector - tag,id - tag#id
        WebElement caddress = driver.findElement(By.cssSelector("textarea#currentAddress"));
        caddress.sendKeys("this is the current address of the Vedha");

//  CSS Selector - tag,id - tag#id
        WebElement paddress = driver.findElement(By.cssSelector("textarea#permanentAddress"));
        paddress.sendKeys("This is the Permanent address of the Vedha");

        Thread.sleep(2000);

//  CSS Selector - tag, class - tag.classname
        WebElement submit = driver.findElement(By.cssSelector("button.btn"));
        submit.click();

        driver.quit();
    }
}
