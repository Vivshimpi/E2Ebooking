package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPagePOMClass
{
WebDriver driver;

@FindBy(xpath="//a[@id='menu-toggle']")WebElement menuBtn;
public void clickOnMenuBtn()
{
	menuBtn.click();
}

@FindBy(xpath="//a[text()='Logout']")WebElement logoutBtn;
public void clickOnLogoutBtn()
{
	logoutBtn.click();
}

public LogoutPagePOMClass(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
}
