package com.steps;

import org.junit.Assert;

import com.voone.pgobjects.LoginPgObject;
import com.voone.pgobjects.PopupsLoadPgObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateQuickLinksSteps extends BasicTest {
	PopupsLoadPgObjects popupsLoadPgObjects;
	//LoginPgObject loginPgObject;
	
	
	@When("^user click on GR visual link$")
	public void user_click_on_GR_visual_link() throws Throwable {
		popupsLoadPgObjects		=new PopupsLoadPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		popupsLoadPgObjects.clickGR_Visuallink();
		Thread.sleep(5000);
	
	}

	@Then("^user should be direct to Genealogy Report - Visual Genealogy with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_Genealogy_Report_Visual_Genealogy_with_popup_window(String GenealogyPopUp) throws Throwable {
		Assert.assertEquals("PopUp Window validation", GenealogyPopUp,driver.getCurrentUrl());
		Thread.sleep(10000);
	}


}
