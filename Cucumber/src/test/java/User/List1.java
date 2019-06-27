package User;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class List1 {
	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Account creation");
	}

	@When("I enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) {
	    List <Map < String , String> > list = dataTable.asMaps(String.class , String.class);
	    for(int i=0; i < list.size(); i++)

	    {
	    	System.out.println(list.get(i).get("name"));
	    	System.out.println(list.get(i).get("password"));
	    }
	}

	@Then("I verify the account")
	public void i_verify_the_account() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Account Verified");
	}
}
