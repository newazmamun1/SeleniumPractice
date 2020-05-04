package com.newaz.pr1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorType {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Type of Locator 
		//1. id:
		//2.Name :
		//3.Xpath
		//4.css selector 
		//5.linkText 
		//6. partialLinkText
		//7. class name
		
		//WebElement email =driver.findElement(By.id("email")); // id
		
		//WebElement email =driver.findElement(By.name("email")); //name
		
		//WebElement email =driver.findElement(By.xpath("//input[@id='email']"));//xpath
		// (how to modify : after // remove * & input(html tag) and id value should be single cote)
		
		//WebElement email =driver.findElement(By.cssSelector("#email"));//css selector 
		
		//WebElement email =driver.findElement(By.linkText("Forgot account?")); //linkText
		
		WebElement email =driver.findElement(By.id("email"));
		
		email.sendKeys("newazmamun@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(1000);
		
		driver.findElement(By.id("u_0_b")).click();


	}

}
