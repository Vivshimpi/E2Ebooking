package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass
{
  WebDriver driver;
  
  @FindBy(xpath="//a[@id='btn-make-appointment']")
  WebElement makeAppointmentBtn;
  
  public void clickMakeAppointmentBtn()
  {
	  makeAppointmentBtn.click();  
  }
  
  
  
  public LoginPagePOMClass(WebDriver driver)
  {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
  }
}
