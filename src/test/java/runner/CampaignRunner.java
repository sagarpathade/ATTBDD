package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Campaigns.feature"},
		
		glue = {"steps", "apphooks"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
		
		tags = "@campaigns"
		)

public class CampaignRunner extends AbstractTestNGCucumberTests {

}
