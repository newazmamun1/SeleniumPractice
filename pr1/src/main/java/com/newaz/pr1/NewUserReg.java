package com.newaz.pr1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewUserReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement firstname = driver.findElement(By.id("u_0_m"));
		firstname.sendKeys("Mohammad");
		Thread.sleep(1000);
		
		WebElement lastname= driver.findElement(By.id("u_0_o"));
		lastname.sendKeys("Mahfuzur Rahman");
		Thread.sleep(1000);
		
		WebElement email= driver.findElement(By.id("u_0_r"));
		email .sendKeys("mahfuz@gmail.com");
		Thread.sleep(1000);
		
		WebElement reenteremail= driver.findElement(By.id("u_0_u"));
		reenteremail .sendKeys("mahfuz@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("u_0_w")).sendKeys("mahfuz12345");
		Thread.sleep(1000);
		
		WebElement month =driver.findElement(By.id("month"));
		Select s = new Select(month);
		s.selectByVisibleText("Jan");
		Thread.sleep(1000);
		
	    WebElement day =driver.findElement(By.id("day"));
	    Select d = new Select(day);
	    d.selectByVisibleText("25");
	    Thread.sleep(1000);
	    
	    WebElement year =driver.findElement(By.id("year"));
	    Select y = new Select(year);
	    y.selectByVisibleText("2000");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("u_0_7")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("u_0_13")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.linkText("Terms")).click();
	    
	    
	    System.out.println(driver.getCurrentUrl());    
	    System.out.println(driver.getTitle());
	    
	    
		
		
		
		
		
		
		
		
		
		

	}

}
