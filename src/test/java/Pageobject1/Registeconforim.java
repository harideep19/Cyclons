package Pageobject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeconforim extends Basepage1 {

	public Registeconforim(WebDriver Driver) {
		super(Driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='id_7']")
	WebElement psd;
	
	@FindBy(xpath="//input[@id='id_8']")
	WebElement cpsw;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement cb;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement capcha;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	
	
	public void psd() {
		psd.sendKeys("Harideep");
		
	}
	public void cpsw() {
		cpsw.sendKeys("Harideep");
		
	}
	public void cb() {
		cb.click();
	}
	
	public void capcha() {
		capcha.click();
	}
	public void submit() {
		submit.click();
	}
	
	
	
	
	
	
	
	

}
