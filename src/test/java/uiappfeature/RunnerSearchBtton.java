package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features= {"src\\test\\java\\uiappfeature\\SearchButttonFunSteps.java"},

		glue= {"Steps"},
		plugin= {"pretty"}

		)



public class RunnerSearchBtton extends AbstractTestNGCucumberTests  {

}
