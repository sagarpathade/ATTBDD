package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
	

@Given("user should present on home page")
public void user_should_present_on_home_page() {
   System.out.println("Given statement");
}

@When("user clicks on add profile button")
public void user_clicks_on_add_profile_button() {
    System.out.println("Add Profile");
}

@When("user enters the data")
public void user_enters_the_data() {
   System.out.println("Addition of data");
}

@Then("Profile should get created")
public void profile_should_get_created() {
    System.out.println("Profile creation");
}

@When("user clicks on edit profile button")
public void user_clicks_on_edit_profile_button() {
	 System.out.println("Edit Profile");
}

@When("user updates the data")
public void user_updates_the_data() {
	System.out.println("Modification of data");
}

@Then("Profile should get modified")
public void profile_should_get_modified() {
	 System.out.println("Profile updation");
}

@When("user clicks on delete profile button")
public void user_clicks_on_delete_profile_button() {
	 System.out.println("delete Profile");
}

@Then("Profile should get deleted")
public void profile_should_get_deleted() {
	 System.out.println("Profile deletion");
}


}
