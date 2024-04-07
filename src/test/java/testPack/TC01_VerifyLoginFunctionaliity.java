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
}
}
