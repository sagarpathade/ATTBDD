package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	

@Given("User should be at the registration page")
public void user_should_be_at_the_registration_page() {
  System.out.println("Given statement");
}

@When("User enters the data in following manner")
public void user_enters_the_data_in_following_manner(DataTable dataTable) {
   
	List<List<String>> data = dataTable.asLists();
	
	List<String> firstList = data.get(2);
	
	String emailAddress = firstList.get(2);
	
	System.out.println("Email address is "+emailAddress);
	
	
	String lastName = data.get(1).get(1);
	
	System.out.println(lastName);
	
	System.out.println("********************************");
	
	for(List<String> value:data)
	{
		System.out.println(value);
	}
	
	System.out.println("**************Reading using Maps*******************");
	
	List<Map<String, String>> data1 = dataTable.asMaps();
	String mobileNumber = data1.get(0).get("mobile");
	System.out.println(mobileNumber);
}

@When("user clicks on submit button")
public void user_clicks_on_submit_button() {
   System.out.println("Clicked on submit button");
}

@Then("account should get created")
public void account_should_get_created() {
   System.out.println("Acount created");
}

}
