package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	
	 @Given("^User is on Netbanking login page$")
	    public void user_is_on_netbanking_login_page() throws Throwable {
	        
		 
	    }

	    @When("^User is  login into application with username and password$")
	    public void user_is_login_into_application_with_username_and_password() throws Throwable {
	       
	    	System.out.println("Login ");
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	        
	    	System.out.println("Login2  ");
	    }

	    @And("^Card is displayed$")
	    public void card_is_displayed() throws Throwable {
	        
	    	System.out.println("Login3 ");
	    }
		
}
