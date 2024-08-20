package com.google.MaveenProject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Inventory {
	//declaration 
	@FindBy(xpath ="/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[1]/div/input")
	public WebElement User;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[2]/div/input")
	public WebElement Pwd;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[4]/button")
	
	WebElement LoginBtn;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/div/a[1]")
	WebElement PS;
	
	@FindBy(xpath ="//*[@id=\"navbarSupportedContent\"]/ul[2]/li[2]/a")
	public WebElement pointofsale;
	
	@FindBy(xpath = "//*[@id=\"navbarSmallScreen\"]/ul/li[2]/div/a[1]")
	public WebElement clickpos;
	
	@FindBy(xpath = "//*[@id=\"party_id\"]/option[3]")
	public WebElement customername;
	
	@FindBy(xpath = "//*[@id=\"voucher_number\"]")
	public WebElement billnumber;
	
	@FindBy(xpath = "//*[@id=\"voucher_date\"]")
	public WebElement date;
	

	
	@FindBy(id = "cashier_id")
	public WebElement cashier;
	
	@FindBy(id="salesman_id")
	public WebElement saleman;
	
	@FindBy(id="voucher_status")
	public WebElement status;
	
	@FindBy(id="counter_number")
	public WebElement counterno;
	
	@FindBy(xpath="//*[@id=\"barcode\"]")
	public WebElement barcode;
	
	@FindBy(xpath="//*[@id=\"barcode\"]")
	public WebElement barcodeclick;
	
	@FindBy(xpath = "//*[@id=\"qty\"]")
	WebElement qty;
	
	@FindBy(xpath="//*[@id=\"discount\"]")
	WebElement discount;
	
	@FindBy(xpath = "//*[@id=\"discountType\"]/option[2]")
	WebElement discounttype;
	
	@FindBy(xpath = "//*[@id=\"rate_inclusive_tax\"]")
	WebElement Rateoftax;
	
	@FindBy(xpath="//*[@id=\"overall_discount\"]")
	WebElement overalldiscount;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-pointofsale/form/div[2]/div[2]/div[2]/div/div[4]/div/div[1]/label")
	WebElement terminal;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-pointofsale/form/div[2]/div[3]/input[2]")
	WebElement submit;
	
	

	
	
	


 public Inventory(WebDriver driver)
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
 public void PS1()
 {
	PS.click();
 }
 
 public void clickpointofsale()
	{
		pointofsale.click();
	}
 public void clickddpos()
 {
	 clickpos.click();
 }
 public void clickcustomername()
 {
	
	 customername.click();
	 
 }
 public void clickbillno()
 {
	 billnumber.click();
	 
 }
 public void clickdate()
 {
	 date.click();
 }
 public void clickcashier()
 {
	Select dropdwn = new Select(cashier);
	dropdwn.selectByIndex(2);
 }
 public void clicksalesman()
 {
	 Select dropdwn = new Select(saleman);
	    dropdwn.selectByIndex(4);
 }
 public void clickstatus()
 {
	 Select dropdown = new Select(status);
		
		dropdown.selectByIndex(1);
	
 }
 public void clickcountno(String count)
 {
 	counterno.sendKeys(count);
 }
 public void clickbarcode(String code)
 {
	 barcode.sendKeys(code);
 }
 public void clickbarcode1()
 {
	 
	 barcodeclick.click();
 }
 public void sendqty(String uqty)
 {
	 
	 qty.sendKeys(uqty);
 }
 public void senddiscount(String udiscount)
 {
	 discount.sendKeys(udiscount);
 }
 public void clickdiscountype()
 {
	 discounttype.click();
 }
 public void sendrateoftax(String urateoftax)
 {
	 Rateoftax.sendKeys(urateoftax);
 }
 public void sendoveralldiscount(String uoveralldiscount)
 {
	 overalldiscount.sendKeys(uoveralldiscount);
 }
 public void clickterminal()
 {
	 terminal.click();
 }
 public void clicksub()
 {
	 submit.click();
 }


}


