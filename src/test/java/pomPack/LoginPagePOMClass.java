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
  
  @FindBy(xpath="//input[@id='txt-username']")
  WebElement username;
  
  public void sendUserName()
  {
	  username.sendKeys("John Doe"); 
  }
  
  @FindBy(xpath="//input[@id='txt-password']")
  WebElement password;
  
  public void sendPassword()
  {
	  password.sendKeys("ThisIsNotAPassword"); 
  }
  
  @FindBy(xpath="//button[@id=\"btn-login\"]")
  WebElement loginBtn;
  
  public void clickLoginBtn()
  {
	  loginBtn.click();
  }
  
  
  
  public LoginPagePOMClass(WebDriver driver)
  {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
  }
}
