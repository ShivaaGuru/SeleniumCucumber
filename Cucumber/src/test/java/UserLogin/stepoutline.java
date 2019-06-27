package UserLogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepoutline {
	@Given("I want to enter {string}")
	public void i_want_to_enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}

	@When("I want to entersecure {string}")
	public void i_want_to_entersecure(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	}

	@Then("the page is displayed")
	public void the_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Page is displayed");
	}

}
