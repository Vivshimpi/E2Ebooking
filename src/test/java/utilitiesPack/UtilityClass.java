package utilitiesPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
public static void screenShotMethod(WebDriver driver, String name) throws IOException
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourse = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("E:\\ProjectSnap\\E2E snap\\"+ name +".jpg");
	FileHandler.copy(sourse, dest);
}
}
