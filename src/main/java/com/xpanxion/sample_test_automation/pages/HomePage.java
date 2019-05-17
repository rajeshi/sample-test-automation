package com.xpanxion.sample_test_automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By searchTextBox = By.xpath("//div[@id='example_filter']/label/input[@type='search']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage enterTextIntoSearchBox(String value) {
        waitForElementVisible(searchTextBox).sendKeys(value);
        return this;
    }
}
