package com.Kiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OptimizeTesting {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost/gatepass/search.php");

        // Test Case 1: Verify URL and Page Title
        verifyURLAndPageTitle(driver, "http://localhost/gatepass/search.php", "Search");

        // Test Case 2: Search for an item
        searchItem(driver, "7");

        // Test Case 3: Click on the first result
        clickFirstResult(driver);

        // Test Case 4: Enter reason and submit
        enterReasonAndSubmit(driver, "Medical");

        // Test Case 5: Click on an element
        clickElement(driver);

        // Test Case 6: Logout
        logout(driver);

        // Test Case 7: HOD Login
        hodLogin(driver);

        // Test Case 8: Approve Granting
        approveGranting(driver);

        // Test Case 9: Reject Granting
        rejectGranting(driver);

        // Close the browser
        driver.quit();
    }

    public static void verifyURLAndPageTitle(WebDriver driver, String expectedURL, String expectedTitle) {
        String actualURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualURL, expectedURL, "URL verification failed");
        Assert.assertEquals(actualTitle, expectedTitle, "Page title verification failed");
    }

    public static void searchItem(WebDriver driver, String item) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/center/div/form/input")).sendKeys(item);
        driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
        Thread.sleep(3000);
    }

    public static void clickFirstResult(WebDriver driver) {
        driver.findElement(By.xpath("//*[@id=\"table\"]/tbody[1]/tr/td[1]/a")).click();
    }

    public static void enterReasonAndSubmit(WebDriver driver, String reason) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"Reason_Value\"]")).sendKeys(reason);
        driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
        Thread.sleep(3000);
    }

    public static void clickElement(WebDriver driver) {
        driver.findElement(By.xpath("/html/body/div[2]/a/button/img")).click();
    }

    public static void logout(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/a/button/img")).click();
        Thread.sleep(3000);
    }

    public static void hodLogin(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/center/button[3]")).click();
        Thread.sleep(3000);
    }

    public static void approveGranting(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"table\"]/tbody[1]/tr/td[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/input[1]")).click();Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"up1\"]")).click();
        Thread.sleep(2000);
    }

    public static void rejectGranting(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"table\"]/tbody[1]/tr/td[5]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/input[2]")).click();Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"up1\"]")).click();
        Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/header/a/button/img")).click();
      driver.findElement(By.xpath("/html/body/center/button[4]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/header/div[2]/table/tbody/tr/td[2]/a/button/img")).click();
      Thread.sleep(2000);
    }
}
