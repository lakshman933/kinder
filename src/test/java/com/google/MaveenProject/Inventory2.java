package com.google.MaveenProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Inventory2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.gst-manager.pages.dev/");
		driver.manage().window().maximize();
		
		
		Inventory obj = new Inventory(driver);
		obj.SendUsername("ecounter@gmail.com");
		obj.SendPassword("Admin@123");
		obj.LoginButton();
		Thread.sleep(10000);
		obj.clickpointofsale();
		obj.PS1();
		Thread.sleep(5000);
		obj.clickcustomername();
		obj.clickbillno();
		obj.clickdate();
		obj.clickcashier();
		obj.clicksalesman();
		obj.clickstatus();
		Thread.sleep(5000);
		
		obj.clickcountno("5");
		Thread.sleep(5000);
		obj.clickbarcode("@B");
		obj. clickbarcode1();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		obj.sendqty("5");
		obj.senddiscount("2");
		obj.clickdiscountype();
		obj.sendrateoftax("5000");
		obj.sendoveralldiscount("5");
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		
		 Thread.sleep(3000);
		
		obj.clickterminal();
		obj.clicksub();

	}

}
