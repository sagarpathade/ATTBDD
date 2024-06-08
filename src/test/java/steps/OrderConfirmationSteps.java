package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {
	PlaceOrderSteps  placeOrder;
	String prdId;
	
	public OrderConfirmationSteps(PlaceOrderSteps placeOrder)
	{
		this.placeOrder = placeOrder;
	}
	
	
	@When("I click on place order button")
	public void i_click_on_place_order_button() {
	   System.out.println("Clicking on place order button");
	}

	@Then("Order should get confirmed")
	public void order_should_get_confirmed() {
		
		prdId = placeOrder.getProductId();
		
	  System.out.println("Order confirmed with the product id : "+prdId);  
	}


}
