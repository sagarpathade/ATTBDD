package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignsSteps {
	
	@Given("user is at campaigns page")
	public void user_is_at_campaigns_page() {
	    System.out.println("Given statement for campaign page");
	}

	@When("user click on create campaign button")
	public void user_click_on_create_campaign_button() {
	  System.out.println("clicked on campaign button");
	}

	@When("user enters the details")
	public void user_enters_the_details() {
	   System.out.println("Entered the details");
	}

	@Then("campaign gets created")
	public void campaign_gets_created() {
	    System.out.println("Campaign created");
	}

	@When("user click on edit campaign button")
	public void user_click_on_edit_campaign_button() {
	   System.out.println("Editing the campaign");
	}

	@When("user enters the schedule")
	public void user_enters_the_schedule() {
	   System.out.println("Scheduling campaign");
	}

	@Then("campaign gets schedule")
	public void campaign_gets_schedule() {
		   System.out.println("campaign scheduled");
	}

	@Given("user should have a sent campaign")
	public void user_should_have_a_sent_campaign() {
	  System.out.println("Validate sent campaign");
	}

	@Then("user should see the count of campaign")
	public void user_should_see_the_count_of_campaign() {
	    System.out.println("Validating sent count");
	}

}
