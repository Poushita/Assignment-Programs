
package com.assignment.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q6TestNG {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
    }

    @Test
    public void verifyLogoUsingMavenAndTestNG() {
        boolean logo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[contains(@class,'mmtLogo')]")
                )
        ).isDisplayed();

        Assert.assertTrue(logo);
        System.out.println("MakeMyTrip logo is present using Maven and TestNG");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
