package org.thetestingacademy.ex03_Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Locators_Practise_01 {
    @Test
    public void Locators() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();
//        In this class practised about Link Text and Partial linktext locators in Selenium
        WebElement icon = driver.findElement(By.linkText("PRODUCT STORE"));
        icon.click();
        Thread.sleep(2000);
//        Using TagName Locator finding links in the webpage and printing them -
//        storing in list as multiple tags with same name are present
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = links.size();
        for (WebElement link :links){
            System.out.println(links);
        }
        System.out.println(count);
//        Using ClassName locator - storing in list as multiple tags with same name are present
        List<WebElement> header = driver.findElements(By.className("nav-item"));
        int count_2 = header.size();
        System.out.println(count_2);
//        Clicking on the second Element from above list
        header.get(2).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
