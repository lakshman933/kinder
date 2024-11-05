package com.google.MaveenProject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class quatation1{
	//declaration 
	@FindBy(xpath ="/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[1]/div/input")
	public WebElement User;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[2]/div/input")
	public WebElement Pwd;
	
	@FindBy(xpath = "/html/body/app-root/app-signin/div/div/div[1]/div/div/form/div[4]/button")
	
	WebElement LoginBtn;
	
	@FindBy(xpath ="//*[@id=\"navbarSupportedContent\"]/ul[2]/li[3]/a")
	WebElement qut;
	
	
	@FindBy(xpath ="//*[@id=\"navbarSupportedContent\"]/ul[2]/li[3]/div/a[2]")
	WebElement  qutadd   ;
	
	
	@FindBy(xpath ="//*[@id=\"party_id\"]")
	WebElement qutname ;
	
	
	@FindBy(xpath ="//*[@id=\"voucher_date\"]")
	WebElement  qutdate   ;
	
	
	@FindBy(xpath ="//*[@id=\"validity_in_days\"]")
	WebElement  qutvalid ;
	
	
	@FindBy(xpath ="//*[@id=\"status\"]")
	WebElement qutvoucher ;
	
	
	@FindBy(xpath ="//*[@id=\"salesman_id\"]")
	WebElement  qutsalesman   ;
	
	
	@FindBy(xpath ="//*[@id=\"division_id\"]")
	WebElement   qutdivision  ;
	
	@FindBy(xpath ="//*[@id=\"barcode\"]")
	WebElement   qutbarcode  ;
	
	
	@FindBy(xpath ="//*[@id=\"qty\"]")
	WebElement  qty   ;
	
	
	@FindBy(xpath ="//*[@id=\"sales_rate\"]")
	WebElement   salesrate  ;
	
	@FindBy(xpath ="//*[@id=\"discount\"]")
	WebElement    disc ;
	
	
	@FindBy(xpath ="//*[@id=\"discountType\"]")
	WebElement disctyp    ;
	
	@FindBy(xpath = "//*[@id=\"rate_inclusive_tax\"]")
	WebElement salerate  ;
	
	
	@FindBy(xpath = "//*[@id=\"overall_discount\"]")
	WebElement  overalldisc ;
	
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-createquatation/form/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/select")
	WebElement overalldisctype  ;
	
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-createquatation/form/div[2]/div[2]/div[2]/div/div[4]/div/div[1]/label")
	WebElement therimal  ;
	
	
	@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div/app-createquatation/form/div[2]/div[2]/div[2]/div/div[4]/div/div[2]/label")
	WebElement a4;
	
	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div/app-createquatation/form/div[2]/div[3]/input[2]")
	WebElement submit  ;
	
	 public quatation1 (WebDriver driver)
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
	 public void clickqut()
	 {
		 qut.click();
	 }
	 public void clickqutadd()
	 {
		 qutadd.click();
	 }
	 public void clickpartyname1()
	 {
		 Select dropdwn = new Select(qutname);
			dropdwn.selectByIndex(5);
	 }
	 public void clickdte()
	 {
		 qutdate.click();
	 }
     public void sendvalidate(String uvalidate)
     {
    	 qutvalid.sendKeys(uvalidate);
     }
     public void clickstatus()
     {
    	 qutvoucher.click();
    	 
     }
     public void clicksalesman()
     {
    	 Select dropdwn = new Select(qutsalesman);
 		dropdwn.selectByIndex(2);
     }
     public void clickdivision()
     {
    	 Select dropdwn = new Select(qutdivision);
 		dropdwn.selectByIndex(5);
     }
     public void sendbarcode(String ubarcode)
     {
    	 qutbarcode.sendKeys(ubarcode);
    	
    	 qutbarcode.sendKeys(Keys.ENTER);
     }
     public  void sendqut(String uqut)
     {
    	 qty.sendKeys(uqut);
     }
     public void senddisc(String udisc)
     {
    	 disc.sendKeys(udisc);
     }
     public void clickdisctype()
     {
    	 Select dropdwn = new Select(disctyp);
 		 dropdwn.selectByIndex(1);
     }
     public void sendrateofsale(String urateofsale)
     {
    	 salerate.sendKeys(urateofsale);
     }
	 public void sendoveralldisc(String uodisc)
	 {
		 overalldisc.sendKeys(uodisc);
	 }
	 public void clickOdisctype()
	 {
		 Select dropdwn = new Select(overalldisctype );
			dropdwn.selectByIndex(1);
	 }
	 public void clicktherminal()
	 {
		 therimal.click();
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
