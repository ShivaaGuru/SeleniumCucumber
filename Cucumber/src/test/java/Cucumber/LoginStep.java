package Cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("User enters Username")
	public void user_enters_Username() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("UserName is Entered");
	}

	@When("User enters Password")
	public void user_enters_Password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Password is entered");
	}

	@And("Click on login Button")
	public void click_on_login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in");
	}

	@Then("Home page is Displayed")
	public void home_page_is_Displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("HomePage is displayed");
	}
}
