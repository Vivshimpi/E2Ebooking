package testPack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilitiesPack.UtilityClass;

public class TestBaseClass 
{
WebDriver driver;
Logger log = Logger.getLogger("E2Ebooking");

@SuppressWarnings("deprecation")
@BeforeMethod
public void preMethod() throws InterruptedException, IOException
{
	PropertyConfigurator.configure("Log4j.properties");
	
	driver = new ChromeDriver();
	log.info("Browser is opened");
	Thread.sleep(2000);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	
	driver.manage().window().maximize();
	log.info("Browser is maximized");
	Thread.sleep(2000);
	
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	log.info("Url is opened");
	Thread.sleep(2000);
	
	UtilityClass.screenShotMethod(driver, "URLOpen");
	log.info("Loginpage snap taken");
}

@AfterMethod
public void tearDown()
{
	driver.quit();
	log.info("browser is closed");
	log.info("End of Script");
}
}
