package com.xpanxion.sample_test_automation.tests;

import com.xpanxion.sample_test_automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTests extends Assert {

    WebDriver driver = null;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testSearchFunctionality1() {
        driver.get("https://datatables.net/");
        HomePage homePage = new HomePage(driver);
        homePage.enterTextIntoSearchBox("Bradley");
    }

    @Test
    public void testSearchFunctionality2() {
        driver.get("https://datatables.net/");
        HomePage homePage = new HomePage(driver);
        homePage.enterTextIntoSearchBox("Michael");
        assertTrue(false, "This is going to fail");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
