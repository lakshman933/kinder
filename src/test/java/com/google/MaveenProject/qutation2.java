package com.google.MaveenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class qutation2 {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.gst-manager.pages.dev/");
		driver.manage().window().maximize();
		
		quatation1 obj = new quatation1(driver);
		obj.SendUsername("ecounter@gmail.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		obj.SendPassword("Admin@123");
		obj.LoginButton();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		obj.clickqut();
		obj.clickqutadd();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		obj.clickpartyname1();
		obj.clickdte();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		obj.sendvalidate("10");
		obj.clickstatus();
		obj.clicksalesman();
		obj.clickdivision();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		obj.sendbarcode("@B");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		obj.sendqut("2");
		obj.senddisc("5");
		obj.clickdisctype();
		obj.sendrateofsale("50000");
		obj.sendoveralldisc("50");
		obj.clickOdisctype();
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
		obj.clicktherminal();
		
		obj.clicka4();
		obj.clicksubmit();
}
}
