package Testcase;

import org.testng.annotations.Test;


import Pageobject1.Homepage;
import Pageobject1.Registeconforim;
import Pageobject1.Register;
import Testbase.Baseclass1;

public class TC_01_register extends Baseclass1 {
	
	@Test
	
	public void register() throws InterruptedException {
		Homepage hp=new Homepage(driver);

		Register rg = new Register(driver);
		
		Registeconforim rc = new Registeconforim(driver);
		
		
			
		
		hp.click_register();
		Thread.sleep(5000);
		rg.name();
		rg.Lname();
		rg.email();
		rg.website();
		rg.gender();
		rg.drpdn();
		rg.cloth();
		rg.mobile();
		rg.landline();
		Thread.sleep(3000);
	    rc.psd();
		rc.cpsw();
		rc.cb();
		rc.capcha();
		rc.submit();
	
	}
		
	
	
	

}
