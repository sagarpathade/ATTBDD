package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.PropReader;

public class ApplicationHooks {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		String browserName = PropReader.readPropData("browser");
		
		driver = df.initBrowser(browserName);
		
		driver.manage().window().maximize();
	}
	
	@After(order = 2)
	public void tearDown(Scenario  scenario)
	{
		boolean isScenarioFailed = scenario.isFailed();
		
		if(isScenarioFailed)
		{
			String scenarioName = scenario.getName();
			
			
			TakesScreenshot	ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", scenarioName);
		}
	}
	
	
	@After(order = 1)
	public void quitBrowser()
	{
		driver.quit();
	}

}
