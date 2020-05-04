package com.newaz.pr1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFF {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.gecko.driver", "browser/geckodriver.exe");
//		WebDriver driver =new FirefoxDriver();
//		driver.get("http://www.google.com");
		
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title =driver.getTitle();
		System.out.println(title); //get title 
		Thread.sleep(1000);
		
		// how to compare title
		//(Validation point)
		
		if (title.equals("Google")) {
			System.out.println("Correct Tile");
		}
		else {
			System.out.println("In-correct title ");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
