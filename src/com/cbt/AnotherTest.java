package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\erkan\\OneDrive\\Masaüstü\\Selenium\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//navigate().to() == get();
		driver.navigate().to("http://www.cybertekschool.com");
		String expected="cybertekschool ya";
		//gets the url of the curent tab
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
        	System.out.println("Expected:\t"+expected);
        	System.out.println("Actual:\t"+actual);
		}
		driver.navigate().to("http://google.com");
		Thread.sleep(1000);  //it does not stop selenium basically it stop execution for certain time.
		//so it wait the page for certain time.
		driver.navigate().back(); // we went back to cybertek
		Thread.sleep(1000);
		driver.navigate().forward();//we went to google again
		driver.navigate().refresh();//it is only refresh current page
		Thread.sleep(2000);
		driver.close(); // it will close curent tab 
		//if there is multiple tab it will not be effected
		//and we can still use the webdriver object
		/*
		 * driver.quit();
		 * you  close all tabs and windows
		 * end sessision we can not use same webdriver object again you need to insatntiated again*/
	}

}
