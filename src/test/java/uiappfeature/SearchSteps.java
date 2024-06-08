package uiappfeature;

import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory;

public class SearchSteps {
	
	SearchPage searchpage = new SearchPage(DriverFactory.getDriver());

@When("user enters {string} in the search field")
public void user_enters_in_the_search_field(String string) {
  
	searchpage.searchProduct(string);
	
}

}
