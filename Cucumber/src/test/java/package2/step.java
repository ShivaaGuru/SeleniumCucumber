package package2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	@Given("User enters new Password")
	public void user_enters_new_Password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("New Password");
	}

	@And("Confirms new password")
	public void confirms_new_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Confirm New Password");
	}

	@When("user clicks the submit button")
	public void user_clicks_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Submit");
	}

	@Then("password is changed")
	public void password_is_changed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Password changed");
	}

	@Given("User enters LoginName")
	public void user_enters_LoginName() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Login Name");
	}

	@And("Enters password")
	public void enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Password");
	}

	@When("user clicks ok button")
	public void user_clicks_ok_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("OK button");
	}

	@Then("Home will be dispalyed")
	public void home_will_be_dispalyed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Home");
	}

	@Given("User search for the product name")
	public void user_search_for_the_product_name() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Product");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("search");
	}

	@Then("product page will be displayed")
	public void product_page_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Product Page");
	}

	@Given("User select the product")
	public void user_select_the_product() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("select product");
	}

	@When("User choose the payment option")
	public void user_choose_the_payment_option() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Payment");
	}

	@Then("User confirms the order")
	public void user_confirms_the_order() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Order Confirmed");
	}

}
