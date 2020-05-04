package com.newaz.pr1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		driver.get("https://book.spicejet.com/");
		
		//Mouse movement will done by Actions class 
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='Login']"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='SubAgentLoginText']")).click();
		

	}

}
