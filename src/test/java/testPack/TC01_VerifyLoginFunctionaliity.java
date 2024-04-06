package testPack;

import java.io.IOException;

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
}
}
