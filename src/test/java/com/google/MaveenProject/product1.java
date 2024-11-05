package com.google.MaveenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;


public class product1 {
	//declaration 
	@FindBy(xpath ="/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[1]/div/input")
	public WebElement User;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[2]/div/input")
	public WebElement Pwd;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[4]/button")
	
	WebElement LoginBtn;
	
	@FindBy(xpath ="//*[@id=\"sidenav-collapse-main\"]/ul/li[2]/a" )
	WebElement Inv;
	
	
	
	@FindBy(xpath ="//*[@id=\"maps\"]/ul/li[1]/a" )
	WebElement product;
	
	@FindBy(xpath ="//*[@id=\"examples\"]/ul/li[2]/a" )
	WebElement productadd;
	
	
	
	@FindBy(xpath ="//*[@id=\"hsn_code\"]" )
	WebElement hsn;
	
	@FindBy(xpath ="//*[@id=\"name\"]" )
	WebElement productname;
	
	@FindBy(xpath ="//*[@id=\"code\"]" )
	WebElement productcode;
	
	@FindBy(xpath ="//*[@id=\"product_category_id\"]" )
	WebElement productcat;
	
	@FindBy(id ="button-addon1")
	WebElement productcatadd;
	
	@FindBy(xpath ="//*[@id=\"name\"]")
	WebElement productcatname;
	
	@FindBy(xpath="//*[@id=\"division_id\"]")
	WebElement productcatdivison;
	
	@FindBy(xpath="//*[@id=\"exampleModal1\"]/div/div/div[2]/form/div[3]/div/label/span")
	WebElement cstatus;
	
	@FindBy(xpath="//*[@id=\"exampleModal1\"]/div/div/div[2]/form/div[4]/button")
	WebElement csave;
	
	@FindBy(xpath ="//*[@id=\"unit_of_measurement_id\"]" )
	WebElement uom;
	
	@FindBy(xpath = "//*[@id=\"batch\"]")
	WebElement batch;
	
	@FindBy(xpath = "//*[@id=\"supplier_id\"]")
	WebElement suppiler;
	
	@FindBy(xpath = "//*[@id=\"button-addon1\"]")
	WebElement saddnew;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement sname;
	
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement smobileno;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement scountry;
	
	@FindBy(xpath="//*[@id=\"pin_code\"]")
	WebElement spincode;
	
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement saddress;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement sstate;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement scity;
	
	@FindBy(xpath="//*[@id=\"exampleModal4\"]/div/div/div[2]/form/div[4]/div[3]/div/label/span")
	WebElement sstatus;
	
	@FindBy(xpath="//*[@id=\"exampleModal4\"]/div/div/div[2]/form/div[5]/button")
	WebElement ssave;
	
	
	@FindBy(xpath="//*[@id=\"tax_id\"]")
	WebElement tax;
	
	@FindBy(xpath="//*[@id=\"mrp\"]")
	WebElement mrp;
	
	@FindBy(xpath="//*[@id=\"discount\"]")
	WebElement discount;
	
	
	@FindBy(xpath="//*[@id=\"purchase_rate\"]")
	WebElement purchaserate;
	
	
	@FindBy(xpath="//*[@id=\"opening_stock\"]")
	WebElement openstock;
	
	
	@FindBy(xpath="//*[@id=\"closing_stock\"]")
	WebElement closestock;
	
	
	@FindBy(xpath="//*[@id=\"recorder_level\"]")
	WebElement reorder;
	
	@FindBy(xpath = "//*[@id=\"generic_name\"]")
	WebElement genric;
	
	@FindBy(xpath = "//*[@id=\"expiry_date\"]")
	WebElement date;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-productdetails/div[2]/form/div/div[5]/div[2]/button")
	WebElement clear;
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	WebElement description;
	
	@FindBy(xpath = "//*[@id=\"catalog_price\"]")
	WebElement catlogprice;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-productdetails/div[2]/form/div/div[6]/div[3]/div/label/span")
	WebElement avonline;
	
	@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div/app-productdetails/div[2]/form/div/div[6]/div[4]/div/label/span")
	WebElement status;
	
	@FindBy(xpath ="//*[@id=\"image\"]")
	WebElement save;
	
	public product1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	 //utilization
	  public void SendUsername(String uname)
	 {
		User.sendKeys(uname);
	 }

	 public void SendPassword(String password)
	 {
	 	Pwd.sendKeys(password);
	 }

	 public void LoginButton()
	 {
		LoginBtn.click();
	}
	 
	public void clickinv()
	{
		Inv.click();
	}
	public void clickproduct()
	{
		product.click();
	}
	public void clickproductdd()
	{
		productadd.click();
	}
	public void sendhsn(String uhsn)
	{
		hsn.sendKeys(uhsn);
	}
	public void sendprouctname(String uproductname)
	{
		productname.sendKeys(uproductname);
	}
	public void sendproductcode(String uproductcode)
	{
		productcode.sendKeys(uproductcode);
	}
	public void clickproductcat()
	{
		Select dropdwn = new Select(productcat);
		dropdwn.selectByIndex(2);
	}
	public void clickcaddnew()
	{
		productcatadd.click();
	}
	public void sendcname(String ucname)
	{
		productcatname.sendKeys(ucname);
	}
	public void clickcdivisionname()
	{
		Select dropdwn = new Select(productcatdivison);
		dropdwn.selectByIndex(7);
	}
	public void clickcstatus()
	{
		cstatus.click();
	}
	public void clickcsave()
	{
		csave.click();
	}
	public void clickuom()
	{
		Select dropdwn = new Select(uom);
		dropdwn.selectByIndex(8);
	}
	public void sendbatchno(String ubatch)
	{
		batch.sendKeys(ubatch);
		
	}
	public void clicksupplier()
	{
		Select dropdwn = new Select(suppiler);
		dropdwn.selectByIndex(5);
	}
	public void clicksaddnew()
	{
		saddnew.click();
		
	}
	public void sendSname(String uname)
	{
		sname.sendKeys(uname);
	}
	public void sendSmobieno(String umobileno)
	{
		smobileno.sendKeys(umobileno);
	}
	public void sendScountry(String ucountry)
	{
		scountry.sendKeys(ucountry);
	}
	public void sendSpincode(String upincode)
	{
		spincode.sendKeys(upincode);
	}
	public void sendSaddress(String uaddress)
	{
		saddress.sendKeys(uaddress);
	}
	public void sendSstate(String ustate)
	{
		sstate.sendKeys(ustate);
	}
	public void sendScity(String ucity)
	{
		scity.sendKeys(ucity);
	}
	public void clickSstatus()
	{
		sstatus.click();
	}
	public void clickSsave()
	{
		ssave.click();
	}
	public void clickgst()
	{
		Select dropdwn = new Select(tax);
		dropdwn.selectByIndex(1);
	}
	public void sendmrp(String umrp)
	{
		mrp.click();
	}
	public void senddiscount(String udiscount)
	{
		discount.sendKeys(udiscount);
	}
	public void sendpurchaserate(String upurchase)
	{
		purchaserate.sendKeys(upurchase);
	}
	public void sendopenstock(String uopenstock)
	{
		openstock.sendKeys(uopenstock);
	}
	public void sendclosingstock(String uclosingstock)
	{
		closestock.sendKeys(uclosingstock);
	}
	public void sendreorder(String ureorder)
	{
		reorder.sendKeys(ureorder);
	}
	public void sendgenric(String ugeneric)
	{
		genric.sendKeys(ugeneric);
	}
	public void clickdate()
	{
		date.click();
	}
	public void clickclear()
	{
		clear.click();
	}
	public void senddesciption(String udesc)
	{
		description.sendKeys(udesc);
	}
	public void sendcatlog(String uctlog)
	{
		catlogprice.sendKeys(uctlog);
	}
	public void clickavailabelonline()
	{
		avonline.click();
	}
	public void clickstatus()
	{
		status.click();
	}
	public void clicksave1()
	{
		save.click();
	}
}

	