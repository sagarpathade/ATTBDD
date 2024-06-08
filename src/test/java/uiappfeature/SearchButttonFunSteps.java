package uiappfeature;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SEarchButtonfun;
import qa.DriverFactory;

public class SearchButttonFunSteps {
	SEarchButtonfun SEarchButtonfun1=new SEarchButtonfun(DriverFactory.getDriver());
@Given("User is on home page")
public void user_is_on_home_page() {
	WebDriver  driver=DriverFactory.getDriver();
	driver.get("https://www.amazon.in/");
	
}

@Given("user search for {string}")
public void user_search_for(String string) {
	SEarchButtonfun1.searchProduct(string);
	
}

@Then("user land on mobile page")
public void user_land_on_mobile_page() {
   System.out.println("Hello");
}




}
