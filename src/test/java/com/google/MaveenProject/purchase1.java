package com.google.MaveenProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class purchase1 {
	//declaration 
	@FindBy(xpath ="/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[1]/div/input")
	public WebElement User;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[2]/div/input")
	public WebElement Pwd;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[4]/button")
	WebElement LoginBtn;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[2]/li[1]/a")
	WebElement purchase;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[1]/div/a[1]")
	WebElement purchase1;
	
	@FindBy(xpath ="//*[@id=\"vendor_id\"]")
	WebElement suppiler;
	
	@FindBy(xpath = "//*[@id=\"voucher_date\"]")
	WebElement date;
	
	@FindBy(xpath="//*[@id=\"vendor_invoice_number\"]")
	WebElement invoice;
	
	@FindBy(xpath="//*[@id=\"lr_number\"]")
	WebElement lrnumber;
	
	@FindBy(xpath="//*[@id=\"voucher_status\"]")
	WebElement delivery;
	
	@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div/app-purchaseinvoice/form/div[1]/div[2]/div[2]/div[3]/input")
	WebElement barcode;
	
	@FindBy(xpath="//*[@id=\"qty\"]")
	WebElement qty;
	
	@FindBy(xpath="//*[@id=\"discount\"]")
	WebElement discount;
	
	@FindBy(xpath = "//*[@id=\"discountType\"]")
	WebElement discounttype;
	
	@FindBy(xpath = "//*[@id=\"rate_inclusive_tax\"]")
	WebElement rateincludetax;
	
	@FindBy(xpath = "//*[@id=\"overall_discount\"]")
	WebElement overalldiscount;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-purchaseinvoice/form/div[2]/div[2]/div/div[4]/div/div[2]/div/select")
	WebElement overalldiscounttype;
	
	@FindBy (xpath = "/html/body/app-root/app-admin-layout/div/div/app-purchaseinvoice/form/div[2]/div[2]/div/div[1]/div/div[3]/div/div/label")
	WebElement a4;
	
	@FindBy (xpath ="/html/body/app-root/app-admin-layout/div/div/app-purchaseinvoice/form/div[2]/div[3]/input[2]")
	WebElement submit;
	
	public purchase1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void senduser(String uname)
	{
		User.sendKeys(uname);
	}
	
	public void sendpwd(String upwd)
	{
		Pwd.sendKeys(upwd);
	}
	public void clickbtn()
	{
		LoginBtn.click();
	}
	public void clickpurchase()
	{
		purchase.click();
	}
	public void clickpurchase1()
	{
		purchase1.click();
	}
	public void clicksuppiler()
	{
		Select dropdwn = new Select(suppiler);
		dropdwn.selectByIndex(11);
	}
	public void clickdate()
	{
		date.click();
	}
	public void sendinvoice(String uvoice)
	{
		invoice.sendKeys(uvoice);
	}
	public void sendlr(String ulr)
	{
		lrnumber.sendKeys(ulr);
	}
	public void clickstatus()
	{
		delivery.click();
	}
	public void sendbrcode(String ucode)
	{
		barcode.sendKeys(ucode);
		barcode.sendKeys(Keys.ENTER);
	}
	public void sendqty(String uqty)
	{
		qty.clear();
		qty.sendKeys(uqty);
	}
	public void senddiscount(String udiscount)
	{
		discount.sendKeys(udiscount);
	}
	public void clickdiscounttype()
	{
		Select dropdwn = new Select(discounttype);
		dropdwn.selectByIndex(1);
				
	}
	public void sendrateincluetax(String urateincludetax)
	{
		rateincludetax.sendKeys(urateincludetax);
	}
	public void sendoveralldiscount(String uoveralldiscount)
	{
		overalldiscount.sendKeys(uoveralldiscount);
	}
	public void clickoveralldiscounttype()
	{
		Select dropdwn = new Select(overalldiscounttype);
		dropdwn.selectByIndex(1);
	}
	public void clicka4()
	{
		a4.click();
	}
	public void clicksubmit()
	{
		submit.click();
	}
	
	
}

	