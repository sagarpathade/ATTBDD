package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
	
	@Given("User should be logged into app")
	public void user_should_be_logged_into_app() {
	    System.out.println("Given statement");
	}

	@When("user clicks on order link")
	public void user_clicks_on_order_link() {
	   System.out.println("clicked on order");
	}

	@Then("user redirects to the order page")
	public void user_redirects_to_the_order_page() {
	    System.out.println("On orders page");
	}

	@When("useer clicks on currently placed order button")
	public void useer_clicks_on_currently_placed_order_button() {
	   System.out.println("Clicked on currently placed order");
	}

	@Then("user should see current order information")
	public void user_should_see_current_order_information() {
	    System.out.println("Fetching currently placed order info");
	}

	@When("useer clicks on past order button")
	public void useer_clicks_on_past_order_button() {
		System.out.println("Clicked on past order");
	}

	@Then("user should see past order information")
	public void user_should_see_past_order_information() {
		System.out.println("Fetching past order info");
	}

	@When("useer clicks on cancelled order button")
	public void useer_clicks_on_cancelled_order_button() {
		System.out.println("Clicked on cancelled order");
	}

	@Then("user should see cancelled order information")
	public void user_should_see_cancelled_order_information() {
		System.out.println("Fetching cancelled order info");
	}


}
