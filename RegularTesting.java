package com.Kiran;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegularTesting {
	
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
		int i=9;
		while(i<10)
		{
			String numberAsString = String.valueOf(i);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/center/div/form/input")).sendKeys(numberAsString);		
		driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
		
		Thread.sleep(5000);
		
		
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
		
		//Logout
		driver.findElement(By.xpath("/html/body/header/a/button/img")).click();
		Thread.sleep(3000);
		String url3 = driver.getCurrentUrl();
		System.out.println("Current url: "+ url3);
		String pageTitle3 = driver.getTitle();
		if("Landing".equals(pageTitle3)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		//HOD LOGIN
		driver.findElement(By.xpath("/html/body/center/button[3]")).click();
		Thread.sleep(3000);
		String url4 = driver.getCurrentUrl();
		System.out.println("Current url: "+ url4);
		String pageTitle4 = driver.getTitle();
		if("Aproval".equals(pageTitle4)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		
		//Approved Granting 
		int j=1;
		while(j<2)
		{
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody[1]/tr/td[5]/a")).click();
		Thread.sleep(3000);
		String url5 = driver.getCurrentUrl();
		System.out.println("Current url: "+ url5);
		String pageTitle5 = driver.getTitle();
		if("grant-approval".equals(pageTitle5)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/input[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"up1\"]")).click();
		Thread.sleep(2000);
		
		//Rejected Granting
		driver.findElement(By.xpath("//*[@id=\"table\"]/tbody[1]/tr/td[5]/a")).click();
		Thread.sleep(2000);
		String url6 = driver.getCurrentUrl();
		System.out.println("Current url: "+ url6);
		String pageTitle6 = driver.getTitle();
		if("grant-approval".equals(pageTitle6)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/input[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"up\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"up1\"]")).click();
		Thread.sleep(2000);
		j++;
		}
		driver.findElement(By.xpath("/html/body/header/a/button/img")).click();
		Thread.sleep(2000);
		
		//Gate LOGIN
				driver.findElement(By.xpath("/html/body/center/button[4]")).click();
				Thread.sleep(5000);
				String url7 = driver.getCurrentUrl();
				System.out.println("Current url: "+ url7);
				String pageTitle7 = driver.getTitle();
				if("Users Logs".equals(pageTitle7)) {
					System.out.println("Test Case Passed");
				}
				else {
					System.out.println("Test Case Failed");
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/header/div[2]/table/tbody/tr/td[2]/a/button/img")).click();
				Thread.sleep(2000);
	}

}
