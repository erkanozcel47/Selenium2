package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TEst case 3: basic authentication 1. open chrome 2. go to url
		 * "http://testing-ground.scraping.pro/login" 3. enter username "admin" 4. enter
		 * password "12345" 5. click on Sign in button 6. Verify title contains
		 * Expected: welcome
		 **/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erkan\\OneDrive\\Masaüstü\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://testing-ground.scraping.pro/login");
		Thread.sleep(1000);
		driver.findElement(By.id("usr")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("12345");
		driver.findElement(By.cssSelector("#case_login > form > input[type=\"submit\"]:nth-child(5)")).click();
		driver.getTitle();
		String expected = "welcome";
		String actual = driver.getTitle();
		if (expected.contains(actual)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expexted:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}

		///Thing I Have Learned Today
		/**
		 * get navigate.to navigate.back .forward naviate.refresh
		 * 
		 * getTitle getCurrentUrl
		 * 
		 * sendKeys click
		 * 
		 * close quit
		 * 
		 * findElements
		 */

	}

}
