package testPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomPack.LoginPagePOMClass;
import pomPack.LogoutPagePOMClass;

public class TC03_VerifyLogoutFuntionality extends TestBaseClass
{
@Test
public void verifyLogoutFuntionality() throws InterruptedException
{
	LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	
	lp.clickMakeAppointmentBtn();
	log.info("Clicked on Make Appointment button");
	Thread.sleep(2000);
	
	lp.sendUserName();
	log.info("username is entered");
	Thread.sleep(2000);
	
	lp.sendPassword();
	log.info("password is entered");
	Thread.sleep(2000);
	
	lp.clickLoginBtn();
	log.info("clicked on login btn");
	Thread.sleep(2000);
	
	
	
//	************ Logout Activity *******************
	
	LogoutPagePOMClass lgp = new LogoutPagePOMClass(driver);
	
	lgp.clickOnMenuBtn();
	log.info("clicked on Menu btn");
	Thread.sleep(2000);
	
	lgp.clickOnLogoutBtn();
	log.info("clicked on logout btn");
	Thread.sleep(2000);
	
	
	log.info("Apply Verification for logout");
	
	
	String expectedURL = "https://katalon-demo-cura.herokuapp.com/";
	String actualURL = driver.getCurrentUrl();
	
	Assert.assertEquals(actualURL, expectedURL, actualURL);
	
	
	
	
}
	

}
