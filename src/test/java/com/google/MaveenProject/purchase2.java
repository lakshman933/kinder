package com.google.MaveenProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class purchase2 {

	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.gst-manager.pages.dev/");
		driver.manage().window().maximize();
		
		
		purchase1 obj = new purchase1(driver);
		obj.senduser("ecounter@gmail.com");
		obj.sendpwd("Admin@123");
		obj.clickbtn();
		Thread.sleep(5000);
		obj.clickpurchase();
		obj.clickpurchase1();
		Thread.sleep(5000);
		obj.clicksuppiler();
		obj.clickdate();
		Thread.sleep(5000);
		obj.sendinvoice("5656");
		Thread.sleep(5000);
		obj.sendlr("777777777777776");
		Thread.sleep(5000);
		obj.clickdate();
		Thread.sleep(5000);
		obj.sendbrcode("@B");
		Thread.sleep(3000);
		obj.sendqty("2");
		Thread.sleep(5000);
		obj.senddiscount("50");
		Thread.sleep(5000);
		obj.clickdiscounttype();
		Thread.sleep(5000);
		obj.sendrateincluetax("500");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(5000);
		obj.sendoveralldiscount("10");
		Thread.sleep(5000);
		obj.clickoveralldiscounttype();
		Thread.sleep(5000);
		obj.clicka4();
		Thread.sleep(5000);
		obj.clicksubmit();
		}
}	
		