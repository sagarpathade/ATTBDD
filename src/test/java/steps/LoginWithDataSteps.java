package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("user should be at loginpage")
	public void user_should_be_at_loginpage() {
	    System.out.println("Given statement");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String uname) {
	  System.out.println("Entered username is "+uname);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String pwd) {
		System.out.println("Entered password is "+pwd);
	}

	@When("I click on login {int} button")
	public void i_click_on_login_button(Integer int1) {
	   System.out.println("Entered value for login is "+int1);
	}

	@Then("I should be able to logged in")
	public void i_should_be_able_to_logged_in() {
	   System.out.println("Validating login");
	}



}
