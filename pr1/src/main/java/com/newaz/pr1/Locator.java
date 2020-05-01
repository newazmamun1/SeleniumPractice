package com.newaz.pr1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email =driver.findElement(By.id("email"));
				email.sendKeys("newazammun@gmail.com");
				Thread.sleep(1000);
				
		WebElement password =driver.findElement(By.id("pass"));
				password.sendKeys("123456768");
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Forgot account?")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.className("uiButtonText")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Forgot account?")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.id("identify_email")).sendKeys("+01711252525");
				Thread.sleep(1000);
				
				driver.findElement(By.id("u_0_2")).click();
			
				
//				WebElement login =driver.findElement(By.id("u_0_b"));
//				login.click();
//				
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();

		
				

	}

}
