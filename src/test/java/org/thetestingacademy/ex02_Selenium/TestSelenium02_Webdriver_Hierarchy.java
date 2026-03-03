package org.thetestingacademy.ex02_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestSelenium02_Webdriver_Hierarchy {
//    Covered in this class - TestSelenium04_Webdirver_Hierarchy - 20th Feb
public static void main(String[] args) {
/*   Webdriver hierarchy
        SearchContext(I) -> (2 methods) -> WebDriver(I)(~10 methods) -> RemoteWebDriver(C) (~15 methods)
            -> ChromiumDriver(C) (~25 methods) -> EdgeDriver(C) (~45 methods)

     SearchContext - Interface - findElement, and findElements - GGF
     WebDriver - Interface - some incomplete functions - GF
     RemoteWebDriver - Class- It also has some functions - F
     ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S
*/

//        SearchContext driver = new ChromeDriver();
//        SearchContext driver1 = new EdgeDriver();
//        SearchContext driver = new FirefoxDriver();


//        WebDriver driver = new FirefoxDriver();
//        RemoteWebDriver driver1 = new FirefoxDriver();
//        FirefoxDriver driver2 = new FirefoxDriver();


    // Scenarios
    // // 1. Do want to run on  Chrome or Edge?
    ChromeDriver driver2 = new ChromeDriver();
    // driver2 = FirefoxDriver(); -- If Dynamic dispatch is not used then user can not change object later on in program

    // 2  Do you want to run on Chrome then change to Edge ?
    WebDriver driver = new ChromeDriver();  // Dynamic Dispatch is used, here object can provide specific
                                            // implementation to methods of Superclass i,e. Object Reference Variable
                                            // Object can be changed in program later on
    driver = new EdgeDriver(); // 97%
    driver = new FirefoxDriver(); // 97% -
    driver = new SafariDriver(); // 97% -

    // 3. Do you want to run on multiple browsers, aws machine? 2%
    // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)
}
}
