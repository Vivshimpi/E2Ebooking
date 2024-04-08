package testPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomPack.LoginPagePOMClass;
import utilitiesPack.UtilityClass;

public class TC01_VerifyLoginFunctionaliity extends TestBaseClass
{
@Test
public void verifyLoginFunctionaliity() throws InterruptedException, IOException
{
	LoginPagePOMClass lp = new LoginPagePOMClass(driver);
	lp.clickMakeAppointmentBtn();	
	log.info("Clicked on Make Appointment button");
	Thread.sleep(2000);
	
	UtilityClass.screenShotMethod(driver, "loginPage");
	log.info("login page snap taken");
	
	log.info("Apply Validation");
	String expected = "CURA Healthcare Service";
	
	String actual = driver.getTitle();
	
	Assert.assertEquals(actual, expected, actual);
	
	if(expected.equals(actual))
	{
		log.info("Case passed");
	}
	else
	{
		log.info("Case failed");
    }
	
	lp.sendUserName();
	log.info("username is entered");
	Thread.sleep(2000);

	
	lp.sendPassword();
	log.info("password is entered");
	Thread.sleep(2000);

	lp.clickLoginBtn();
	log.info("clicked ligin btn");
	Thread.sleep(2000);
	
	UtilityClass.screenShotMethod(driver, "MakeAppointmentPage");
	log.info("MakeAppointmentpage snap taken");
	
	log.info("Apply Validation");
	String expected1 = "https://katalon-demo-cura.herokuapp.com/#appointment";
	String actual1 = driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	
	Assert.assertEquals(actual1, expected1, actual1);
	
	if(expected1.equals(actual1))
	{
		log.info("Case passed");
	}
	else
	{
		log.info("Case failed");
    }
	

}
}
