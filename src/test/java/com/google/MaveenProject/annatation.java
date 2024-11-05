package com.google.MaveenProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class annatation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./Library/msedgedriver.exe");
		EdgeDriver obj = new EdgeDriver();
		obj.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(5000);
		
		obj.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(5000);
		Alert alert = obj.switchTo().alert();
		String alertmess = alert.getText();
		alert.accept();
		System.out.println("message from alertbutton: "+alertmess);
		
		obj.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(5000);
		Alert alert1 = obj.switchTo().alert();
		String alertmess1 = alert.getText();
		alert.dismiss();
		System.out.println("mess from alert button: "+alertmess1);
		
		
		obj.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert promt = obj.switchTo().alert();
		String promtmess = alert.getText();
		alert.dismiss();
		System.out.println("alert mess display: "+promtmess);
		
		

	}

}
