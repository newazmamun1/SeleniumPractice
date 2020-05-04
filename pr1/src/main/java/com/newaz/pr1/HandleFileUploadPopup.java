package com.newaz.pr1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// use this URL for practice "https://html.com/input-type-file/"
		
		//sometimes we need choose file/browse/select a file from local drive 
		
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://html.com/input-type-file");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		WebElement eel = driver.findElement(By.xpath("//input[@name='fileupload']"));
		
		js.executeScript("arguments[0].scrollIntoView();", eel);
		
		//eel.click();
		
		eel.sendKeys("C:\\Users\\newaz\\Desktop\\Timesheet_04182020.pdf");

		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		WebElement el =driver.findElement(By.xpath("//*[@id='fileupload']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();", el);
//		
//		el.click();
//		
//		el.sendKeys("C:\\Users\\newaz\\Desktop\\Timesheet_04182020");
		
//		Thread.sleep(5000);
//		driver.findElement(By.id("fileupload")).sendKeys("browser/Timesheet_04182020.pdf");

	}

}
