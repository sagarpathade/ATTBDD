package uiappfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import qa.DriverFactory;

public class HomePageSteps {
	
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	
	@Given("user is at landing page")
	public void user_is_at_landing_page() {
	    
		WebDriver driver = DriverFactory.getDriver();
		
		driver.get("https://www.amazon.in/");
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
	  String title = homepage.getTitleOfPage();
	  
	  boolean isPresent = title.contains(string);
	  
	  Assert.assertEquals(isPresent, true);
	  
	}

	@Then("cart icon should get displayed")
	public void cart_icon_should_get_displayed() {
		boolean isDisplay = homepage.isCartIconDisplayed();
		
		Assert.assertEquals(isDisplay, true);
		
	}

	@When("user clicks on deals section")
	public void user_clicks_on_home_decor_section() {
	   homepage.checkoutDealsSection();
	}

	@Then("user should redirects to home decor section")
	public void user_should_redirects_to_home_decor_section() {
	 boolean isdisplay = homepage.fitnessSection();
	 
	 Assert.assertEquals(isdisplay, true);
	}

}
