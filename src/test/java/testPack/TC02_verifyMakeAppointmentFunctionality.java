package testPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomPack.LoginPagePOMClass;
import pomPack.MakeAppointmentPagePOMClass;
import utilitiesPack.UtilityClass;

public class TC02_verifyMakeAppointmentFunctionality extends TestBaseClass
{
	String monthYear = "May 2024";
	String day = "13";
	String comment = "hi, my name is vivek and I want an appointment";
	@Test
	public void verifyMakeAppointmentFunctionality() throws InterruptedException, IOException
	{
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		lp.clickMakeAppointmentBtn();	
		log.info("Clicked on Make Appointment button");
		Thread.sleep(2000);
		
		UtilityClass.screenShotMethod(driver, "loginPage");
		log.info("login page snap taken");
		
		
		lp.sendUserName();
		log.info("username is entered");
		Thread.sleep(2000);

		
		lp.sendPassword();
		log.info("password is entered");
		Thread.sleep(2000);

		lp.clickLoginBtn();
		log.info("clicked login btn");
		Thread.sleep(2000);
		
		UtilityClass.screenShotMethod(driver, "MakeAppointmentPage");
		log.info("MakeAppointmentpage snap taken");
		
		log.info("Went on Make Appointment Page");
		
		MakeAppointmentPagePOMClass map = new MakeAppointmentPagePOMClass(driver);
		map.clickfacilityDropDown();
		log.info("salect from dropdown done");
		Thread.sleep(2000);
		
		map.clickCheckBox();
		log.info("box is checked");
		Thread.sleep(2000);
		
		map.clickRadioMedicaidBtn();
		log.info("clicked on radio button");
		Thread.sleep(2000);
		
//		***************Date picker code ****************
		map.clickDatePicker();
		log.info("datepicker is selected");
		Thread.sleep(2000);
		
        
       //loop for select  month and year		
		while(true)
		{
			String text = map.gettextfromMonthYEar();
			if(text.equals(monthYear))
			{
				break;
			}
			else
			{
			map.clickNextBtbOnDatePicker();
			Thread.sleep(2000);
            }
		}
		
		map.selectday(day);
		Thread.sleep(2000);
		log.info("select day of APPOINTMENT");
		
		
		log.info("validate day of appointment");
		String expectedday = "13";
		String actualday = map.getClassDay();
		System.out.println(map.getClassDay());
		
		Assert.assertEquals(actualday, expectedday, actualday);
		
		if(expectedday.equals(actualday))
		{
			log.info("Case passed");
		}
		else
		{
			log.info("Case failed");
	    }
		
		
		map.sendkeysToCommentBox(comment);
		Thread.sleep(2000);
		log.info("comment sent to box");
		
		
		
		map.clickOnbookAppointmentBtn();
		Thread.sleep(2000);
		log.info("Clicked on book appointment button");
		
		
		UtilityClass.screenShotMethod(driver, "AppointmentConfirmation");
		log.info("AppointmentConfirmation snap taken");
		
		
		log.info("apply verification for booking confirmation");
		
		String expectedmsg = "Appointment Confirmation";
		String actualmsg = map.getConfirmationText();
		
		
		Assert.assertEquals(actualmsg, expectedmsg, actualmsg);
		if(expectedmsg.equals(actualmsg))
		{
			log.info("case passed");
		}
		else
		{
			log.info("case fail");
		}
		
		map.clickOnGoToHomePageBtn();
		Thread.sleep(2000);
		log.info("went on homePage");
		
		log.info("apply verification for go to homePage button");

		
		String expectedURL = "https://katalon-demo-cura.herokuapp.com/";
		                     
		String actualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL, actualURL);
		if(expectedURL.equals(actualURL))
		{
			log.info("case passed");
		}
		else
		{
			log.info("case fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
