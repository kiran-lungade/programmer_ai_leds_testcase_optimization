package com.Kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Output {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        // Test Case 1: Verify URL and Page Title
        verifyURLAndPageTitle(driver, "http://localhost/gatepass/search.php");

        // Test Case 2: Search for an item
        searchItem(driver, "Computer");

        // Test Case 3: Click on the first result
        clickFirstResult(driver);

        // Test Case 4: Enter reason and submit
        enterReasonAndSubmit(driver, "Leave");

        // Test Case 5: Click on an element
        clickElement(driver);

        // Test Case 6: Verify URL and Page Title
        verifyURLAndPageTitle(driver, "http://example.com");

        // Close the browser
        driver.quit();
    }

    public static void verifyURLAndPageTitle(WebDriver driver, String expectedURL) {
        driver.get(expectedURL);
        String actualURL = driver.getCurrentUrl();
        System.out.println("Expected URL: " + expectedURL);
        System.out.println("Actual URL: " + actualURL);
        // Add assertion or validation logic here
        
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        // Add assertion or validation logic here
    }

    public static void searchItem(WebDriver driver, String item) throws InterruptedException {
        driver.findElement(By.cssSelector("body > div.container.my-5 > div.bod > center > div > form > input[type=text]")).sendKeys(item);
        driver.findElement(By.id("up")).click();
        Thread.sleep(5000);
    }

    public static void clickFirstResult(WebDriver driver) {
        driver.findElement(By.cssSelector("#table tbody tr:first-child td:first-child a")).click();
    }    

    public static void enterReasonAndSubmit(WebDriver driver, String reason) throws InterruptedException {
        driver.findElement(By.id("Reason_Value")).sendKeys(reason);
        driver.findElement(By.cssSelector("#up")).click();
        Thread.sleep(5000);
    }

    public static void clickElement(WebDriver driver) {
        driver.findElement(By.cssSelector("div>a>button>img")).click();
    }
}
