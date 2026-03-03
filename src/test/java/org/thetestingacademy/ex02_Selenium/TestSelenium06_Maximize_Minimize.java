package org.thetestingacademy.ex02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium06_Maximize_Minimize {
//    Covered in this class - TestSelenium08_Maximize_Minimize - 25 Feb
public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
    driver.manage().window().minimize();
    Thread.sleep(2000);
    driver.quit();
}

}
