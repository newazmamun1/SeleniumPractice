package com.newaz.pr1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandale {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// handaling Drop down--> we have create object of select class
		
		Select select =new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");

	}

}
