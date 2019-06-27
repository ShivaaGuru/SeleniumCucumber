package Package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

	@Given("User enters {string}")
	 public void user_enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	} 

	@And("enters {string}")
	 public void enters(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);	
	}

	@When("Click on Login Button")
	 public void click_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Login Button is clicked");
	}

	@Then("Bank Home Page is displayed")
	 public void bank_Home_Page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Banking Home page is displayed");
	}
}
