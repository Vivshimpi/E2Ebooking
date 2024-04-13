package pomPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPagePOMClass 
{

WebDriver driver;
Select sel;



@FindBy(xpath="//select[@id='combo_facility']")WebElement facilityDropDown;
public void clickfacilityDropDown()
{
	facilityDropDown.click();
	sel.selectByVisibleText("Hongkong CURA Healthcare Center");
	
}

@FindBy(xpath="//input[@id='chk_hospotal_readmission']")WebElement checkbox ;
public void clickCheckBox()
{
	checkbox.click();
}

@FindBy(xpath="//input[@id='radio_program_medicaid']")WebElement radioMedicaidBtn ;
public void clickRadioMedicaidBtn()
{
	radioMedicaidBtn.click();
}



//***************Date picker code ****************



@FindBy(xpath="//input[@id='txt_visit_date']")WebElement datePicker ;
public void clickDatePicker()
{
	
	datePicker.click();
	
}

@FindBy(xpath="(//th[@class='datepicker-switch'])[1]")WebElement  monthYear;
public String gettextfromMonthYEar()
{
	return monthYear.getText();
}

@FindBy(xpath="(//th[@class='next'])[1]")WebElement  nextBtbOnDatePicker;
public void clickNextBtbOnDatePicker()
{
	nextBtbOnDatePicker.click();;
}

@FindBy(xpath="//td[@class='day']")WebElement  gettextDayOnDatePicker;
public String getTextDay()
{
	return gettextDayOnDatePicker.getText();
}



public void selectday(String day)
{
	WebElement  DayOnDatePicker = driver.findElement(By.xpath
     ("//table[@class='table-condensed']//td[contains(text(),"+day+")]"));
	DayOnDatePicker.click();
	
}
@FindBy(xpath="//td[@class='active day']")WebElement selectedday;
public String getClassDay()
{
	return selectedday.getText();
	
}

//************************************************************************

@FindBy(xpath="//textarea[@id='txt_comment']")WebElement commentBox;
public void sendkeysToCommentBox(String comment)
{
	commentBox.sendKeys(comment);

}

@FindBy(xpath="//button[@id='btn-book-appointment']")WebElement bookAppointmentBtn;
public void clickOnbookAppointmentBtn()
{
	bookAppointmentBtn.click();
}

@FindBy(xpath="//h2[text()='Appointment Confirmation']")WebElement confirmationText;
public String getConfirmationText()
{
	return confirmationText.getText();
}


@FindBy(xpath="//a[text()='Go to Homepage']")WebElement goToHomePageBtn;
public void clickOnGoToHomePageBtn()
{
	goToHomePageBtn.click();
}

public MakeAppointmentPagePOMClass(WebDriver driver)
{  
	this.driver = driver;
	PageFactory.initElements(driver, this);
	sel = new Select(facilityDropDown);
}
}
