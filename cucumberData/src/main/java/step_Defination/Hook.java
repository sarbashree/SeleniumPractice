package step_Defination;

import java.awt.Image;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.webbitserver.WebbitException;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hook {
 public static WebDriver driver;
 
@Before
 
 public void openbrowser()
 {
	System.out.println("Called openbrowser");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
 }
public void embedScreenshot(Scenario scenario)
{
	if(scenario.isFailed())
	{
		try {
			scenario.write("current Page Url is "+driver.getCurrentUrl());
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot,"image/png");
			
		} catch (WebbitException someplatformDonotsupportscreenshot)
		{
			System.err.println(someplatformDonotsupportscreenshot.getMessage());
		}
	}
}
}
