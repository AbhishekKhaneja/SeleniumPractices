package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefination {
	
	    @Given("^User is on landing Page$")
	    public void user_is_on_landing_page() throws Throwable {
	       System.out.println("User is on landing Page");
	    }

	    @When("^User login into application with Username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	 System.out.println("User login into application with Username and password");
	    }

	    @Then("^Homepage is Populated$")
	    public void homepage_is_populated() throws Throwable {
	    	 System.out.println("Homepage is Populated");
	    }

	    @And("^cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	 System.out.println("cards are displayed");
	    }

	}


