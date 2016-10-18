package com.steps;

import org.junit.Assert;

import com.voone.pgobjects.Online_DashBoardNewPgObjects;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateMyTools_in_CmenuSteps extends BasicTest  {
	Online_DashBoardNewPgObjects online_DashBoardNewPgObjects;
	
	@Given("^user should click on My Tools button$")
	public void user_should_click_on_My_Tools_button() throws Throwable {
		online_DashBoardNewPgObjects	=new Online_DashBoardNewPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		online_DashBoardNewPgObjects.click_MyTools();
	}

	@When("^user click on on e card checker$")
	public void user_click_on_on_e_card_checker() throws Throwable {
		online_DashBoardNewPgObjects	=new Online_DashBoardNewPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		online_DashBoardNewPgObjects.click_eCardChecker();
	}

	@Then("^user should be direct to e card checker with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_e_card_checker_with_popup_window(String e_cardCheckerPopUp) throws Throwable {
		Assert.assertEquals("PopUp Window validation", e_cardCheckerPopUp,driver.getCurrentUrl());
		Thread.sleep(10000);
	}

}
