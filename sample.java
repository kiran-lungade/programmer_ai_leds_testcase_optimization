package com.Kiran;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class sample {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost/gatepass/search.php");
		String url = driver.getCurrentUrl();
		System.out.println("Current url: "+ url);
		String pageTitle = driver.getTitle();
		if("Search".equals(pageTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		int i=5;
		while(i<7)
		{
			String numberAsString = String.valueOf(i);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/center/div/form/input")).sendKeys(numberAsString);		
		driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody[1]/tr/td[1]/a")).click();
		String url1 = driver.getCurrentUrl();
		System.out.println("Current url: "+ url1);
		String pageTitle1 = driver.getTitle();
		if("Display Details".equals(pageTitle1)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"Reason_Value\"]")).sendKeys("Hospital Leave");
		driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/div[2]/a/button/img")).click();
		String url2 = driver.getCurrentUrl();
		System.out.println("Current url: "+ url2);
		String pageTitle2 = driver.getTitle();
		if("Search".equals(pageTitle2)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		i++;
		
	}
		
	}

}
