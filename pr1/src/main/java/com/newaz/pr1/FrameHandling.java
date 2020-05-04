package com.newaz.pr1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "browser/ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("newazmamun1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Newaz@427231");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
		Thread.sleep(3000);
		
		// if there is any frame : click right button , and we can find This Frame.
		//then click View Page Source , then we can see how many frame there .
		
		//driver.switchTo().frame("mainpanel");

		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
		

	}

}
