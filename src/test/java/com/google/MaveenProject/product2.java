package com.google.MaveenProject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class product2 {


	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev.gst-manager.pages.dev/");
		driver.manage().window().maximize();
		
		
		
		 product1 obj = new product1(driver);
		 obj.SendUsername("ecounter@gmail.com");
		 obj.SendPassword("Admin@123");
		 obj.LoginButton();
		
		Thread.sleep(5000);
		obj.clickinv();
		obj.clickproduct();
		Thread.sleep(5000);
	    
		obj.clickproductdd();
		Thread.sleep(5000);
	    
		obj.sendhsn("4554");
		obj.sendprouctname("cycle");
	     
		obj.sendproductcode("@C");
		obj.clickproductcat();
		Thread.sleep(5000);
		obj.clickcaddnew();
		Thread.sleep(5000);
		obj.sendcname("jaffar");
		obj.clickcdivisionname();
		obj.clickcstatus();
		obj.clickcsave();
		Thread.sleep(5000);
		obj.clickuom();
		obj.sendbatchno("3");
		obj.clicksupplier();
		obj.clicksaddnew();
		obj.sendSname("zaheer");
		obj.sendSmobieno("9999999999");
		obj.sendScountry("india");
		obj.sendSpincode("533109");
		obj.sendSaddress("1-3-22/a");
		obj.sendSstate("Anhrapradesh");
		obj.sendScity("papermill");
		obj.clickstatus();
		obj.clickSsave();
		obj.clickgst();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		obj.sendmrp("500");
		obj.senddiscount("5");
		obj.sendpurchaserate("1000");
		obj.sendopenstock("50");
		obj.sendclosingstock("50");
		obj.sendreorder("10");
		obj.sendgenric("med");
		obj.clickdate();
		obj.senddesciption("visit again");
		obj.sendcatlog("55");
		obj.clickavailabelonline();
		obj.clickstatus();
		obj.clicksave1();
	}
}
		
		