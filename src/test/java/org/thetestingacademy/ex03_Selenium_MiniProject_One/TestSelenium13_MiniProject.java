package org.thetestingacademy.ex03_Selenium_MiniProject_One;

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

public class TestSelenium13_MiniProject {
    @Owner("Shravan")
    @Description("User wants to book an appointment")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void bookApppointment() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
//        Clicking the button to Book an Appointment
        WebElement makeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentButton.click();
//        To find Element Username textbox and send value in it
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");
//        To find Element Password textbox and send value in it
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");
//        To find Element login button and send value in it
        WebElement login = driver.findElement(By.tagName("button"));
        login.click();

//        AfterLogin need to check if Make Appointment text is visible on the screen
        WebElement Text = driver.findElement(By.className("text-center"));
        Assert.assertEquals(Text.getText(),"Make Appointment");

        Thread.sleep(2000);

        driver.quit();
    }
}
