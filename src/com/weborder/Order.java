package com.weborder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Selenium Git project Monday project Create a project 'Order'. Add all the
		 * necessary Selenium jars. Create package com.weborder. Create a class 'Order'
		 * and automate the test case below. In the end push your project to GitHub. Do
		 * the automation exercise as a team, but everyone push their own project to
		 * GitHub.
		 * 
		 * Notes Most elements in this exercise have names and ids. For step 4 and 14
		 * you may need a different locators. In addition to that for step 14, you will
		 * need to research how to verify text on a page using selenium.
		 * 
		 * Test Case: Order Open browser Go to url
		 * http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
		 * (Links to an external site.)Links to an external site. Login using username
		 * Tester and password test Click on Order link Enter a random quantity between
		 * 1 and 100 Enter Customer Name: John <middle_name> Smith. Instead of
		 * <middle_name> your code should enter a random string every time. Enter
		 * street: 123 Any st Enter City: Anytown Enter State: Virginia Enter a random 5
		 * digit number to the zip code field Select any card type. Every time your code
		 * should select a different type. Enter any card number. If you selected Visa,
		 * card number should start with 4. If you selected Master, card number should
		 * start with 5. If you selected American Express, card number should start with
		 * 3. New card number should be auto generated every time you run the test. Card
		 * numbers should be 16 digits for Visa and Master, 15 for American Express.
		 * Enter any valid expiration date Click on Process Verify than the page
		 * contains text New order has been successfully added.
		 */

		/**
		 * In the end push your project to GitHub. In addition to that for step 14, you
		 * will need to research how to verify text on a page using selenium.
		 *
		 * Every time your code should select a different type.
		 * 
		 * If you selected Master, card number should start with 5. If you selected
		 * American Express, card number should start with 3.
		 * 
		 * New card number should be auto generated every time you run the test. Card
		 * numbers should be 16 digits for Visa and Master, 15 for American Express.
		 **/

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\erkan\\OneDrive\\Masaüstü\\Selenium\\drivers\\chromedriver.exe");

		// Order Open browser
		WebDriver driver = new ChromeDriver();

		// Go to url
		// http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		// It will pause process for one second
		Thread.sleep(1000);

		// Login using username Tester and password test
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

		// It will pause process for one second
		Thread.sleep(1000);

		// Click on Order link
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();

		// It will pause process for one second
		Thread.sleep(1000);

		// Click on Order link
		driver.findElement(By.xpath("//*[@id=\'ctl00_menu\']/li[3]/a")).click();

		// Enter a random quantity between 1 and 100
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("69");

		// Enter Customer Name: John <middle_name> Smith.
		// Instead of <middle_name> your code should enter a random string every time.
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John Smith");

		// Enter street: 123 Any st
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 any st");

		// Enter State: Virginia
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");

		// Enter City: Anytown
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("AnyTown");

		// Enter a random 5 digit number to the zip code field
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys("12365");

		// Select any card type.
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$cardList")).click();

		// Enter any card number. If you selected Visa, card number should start with 4.
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys("4234567891011121");

		// Enter any valid expiration date
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("12/22");

		// Click on Process
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();

		String expected = "New order has been successfully added";
		String actual = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"))
				.getText();
		if (expected.equals(actual)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expexted:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}

	}

}
