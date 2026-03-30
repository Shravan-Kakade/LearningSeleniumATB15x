package org.thetestingacademy.ex03_Selenium_Locators.cssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector_hub {
    @Test
    public void DummyForm() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        Launching the browser with given url in the method
        driver.get("https://selectorshub.com/xpath-practice-page/");
//        Maximizing the browser window
        driver.manage().window().maximize();

//        CSS Selector - tag[attribute='value']
        WebElement userEmail = driver.findElement(By.cssSelector("input[title='Email']"));
        userEmail.sendKeys("vikram@vedha.com");
        WebElement password = driver.findElement(By.cssSelector("input[name='Password']"));
        password.sendKeys("csshub@123");
//        CSS Selector = tag.classname[Attribute]
        WebElement company = driver.findElement(By.cssSelector("input.form-control[placeholder='Enter your company']"));
        company.sendKeys("CSS Selector");
//        CSS Selector - tag[attribute='value']
        WebElement number = driver.findElement(By.cssSelector("input[type='number']"));
        number.sendKeys("9876543210");
        WebElement country = driver.findElement(By.xpath("//label[text()='Country']/input"));
        country.sendKeys("India");
        Thread.sleep(2000);
        driver.quit();
    }
}
