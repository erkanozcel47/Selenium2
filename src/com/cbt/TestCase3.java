package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) 
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erkan\\OneDrive\\Masaüstü\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		/**
		 * TEst case 3: basic authentication 
		 * 1. open chrome 
		 * 2. go to url "http://newtours.demoaut.com/" 
		 * 3. enter username "tutorial" 
		 * 4. enter password "tutorial" 
		 * 5. click on Sign in button 
		 * 6. Verify title contains
		 * Expected: Find a Flight
		 */

		driver.get("http://newtours.demoaut.com/");
		
		//findElement --> finds elements on page
		//locator-->is a way of finding element on page used by selenium.
		//locators represent in a class called "By" in selenium
		Thread.sleep(2000);
		driver.findElement(By.name( "userName")).sendKeys("tutorial");
		Thread.sleep(2000);
		driver.findElement(By.name( "password")).sendKeys("tutorial");
		//click() --> clicks
		driver.findElement(By.name("login")).click();
		String expected="Find a Flight";
		String actual=driver.getTitle();
		if(expected.contains(actual)) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
			System.out.println("Expexted:\t"+expected);
			System.out.println("Actual:\t"+actual);
		}
	}

}
