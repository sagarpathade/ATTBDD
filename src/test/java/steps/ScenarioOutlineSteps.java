package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
	   System.out.println("Given statement");
	}

	@When("user enters name as {string} in the form")
	public void user_enters_name_as_in_the_form(String string) {
	   System.out.println("Entered name is "+string);
	}

	@When("user enters the age {int}")
	public void user_enters_the_age(Integer int1) {
		System.out.println("Entered age is "+int1);
		if(int1==25)
		{
			throw new NullPointerException();
		}
	}

	@When("user confirms the gender as {string}")
	public void user_confirms_the_gender_as(String string) {
		System.out.println("Confirms gender as "+string);
	}

	@Then("user will get created")
	public void user_will_get_created() {
		System.out.println("User has been created");
	}
	
	@Given("user is logged into application")
	public void prerequiste()
	{
		System.out.println("User has been logged in");
	}

}
