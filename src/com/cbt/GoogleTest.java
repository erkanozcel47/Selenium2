package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		//Open Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\erkan\\OneDrive\\Masaüstü\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.ca");
        
        String expected = "Google";
        String actual=driver.getTitle();
        System.out.println(actual);
        
        if(expected.equals(actual)) {
        	System.out.println("Pass");
        }else {
        	System.out.println("Fail");
        	System.out.println("Expected:\t"+expected);
        	System.out.println("Actual:\t"+actual);
        }
        
        
		//go to url www.google.com
        
       
		//verify title
		
		
		
		
		 
		
		
		
		
		
		
		
		
	}

}
