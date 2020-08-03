package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	@Given("User is on netbanking landing screen")
	public void user_is_on_netbanking_landing_screen() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("login pages");
	}

	@When("User enters username and passowrd into application")
	public void user_enters_username_and_passowrd_into_application() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("entered username and password");
	}

	@Then("User lands on home page")
	public void user_lands_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("user lands on home page");
	}

	@Then("cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("cards are displayed");
	}
	 @When("^User enters username \"([^\"]*)\" and passowrd \"([^\"]*)\" into application$")
	    public void user_enters_username_something_and_passowrd_something_into_application(String strArg1, String strArg2) throws Throwable {
	       // throw new PendingException();
		 System.out.println("username:" +strArg1);
		 System.out.println("password:"+strArg2);
	    }

	    @And("^cards are not  displayed$")
	    public void cards_are_not_displayed() throws Throwable {
	       // throw new PendingException();
	    	System.out.println("card are not dispalyed");
	    }



	
}
