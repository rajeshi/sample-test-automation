package com.xpanxion.sample_test_automation.pages;

import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElementClickable(By by) {
        //Implicit wait it will always wait for that period of time. 10 sec
        //Explicit Wait it will wait for the condition to be satisfied.
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        return this.driver.findElement(by);
    }

    public WebElement waitForElementVisible(By by) {
        //Implicit wait it will always wait for that period of time. 10 sec
        //Explicit Wait it will wait for the condition to be satisfied.
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return this.driver.findElement(by);
    }
}
