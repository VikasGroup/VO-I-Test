package com.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateLoginPageSteps extends BasicTest {
	
	

	@Given("^User opens \"([^\"]*)\" home page$")
	public void user_opens_home_page(String plan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//driver.get(prop.getProperty(plan+".url"));
	    throw new PendingException();
	}

	@When("^User click on ir login$")
	public void user_click_on_ir_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should able to login to the system$")
	public void user_should_able_to_login_to_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
