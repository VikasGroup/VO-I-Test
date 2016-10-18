package com.steps;

import org.junit.Assert;

import com.voone.pgobjects.LoginPgObject;
import com.voone.pgobjects.PopupsLoadPgObjects;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateQuickLinksSteps extends BasicTest {
	PopupsLoadPgObjects popupsLoadPgObjects;
	LoginPgObject loginPgObject;
	
	
	//***************************Genealogy Report - Visual Genealogy*********************//
	
	@When("^user click on GR visual link$")
	public void user_click_on_GR_visual_link() throws Throwable {
		popupsLoadPgObjects		=new PopupsLoadPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		popupsLoadPgObjects.clickGR_Visuallink();
	}
	
	@Then("^user should be direct to Genealogy Report - Visual Genealogy with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_Genealogy_Report_Visual_Genealogy_with_popup_window(String GenealogyPopUp) throws Throwable {
		Assert.assertEquals("PopUp Window validation", GenealogyPopUp,driver.getCurrentUrl());
		Thread.sleep(10000);
	}
	
	//**************************GR By Date*********************//
	
	@When("^user click on GR By Date link$")
	public void user_click_on_GR_By_Date_link() throws Throwable {
		popupsLoadPgObjects		=new PopupsLoadPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		popupsLoadPgObjects.clickGR_ByDate();
	}
	
	@When("^user should proceed to Dashboard page \"([^\"]*)\"$")
	public void user_should_proceed_to_Dashboard_page(String DashboardURL) throws Throwable {
		Assert.assertEquals("Validate Dashboard page", "https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_DashBoardNew.aspx",DashboardURL);
	}
	
	@Then("^user should be direct to Genealogy Report - By Date with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_Genealogy_Report_By_Date_with_popup_window(String GenealogyByDatePopUp) throws Throwable {
		Assert.assertEquals("PopUp Window validation", GenealogyByDatePopUp,driver.getCurrentUrl());
		Thread.sleep(10000);
	}
	
	//********************eCard Checker******************//
	
	@When("^user click on eCard Checker link$")
	public void user_click_on_eCard_Checker_link() throws Throwable {
		popupsLoadPgObjects		=new PopupsLoadPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		popupsLoadPgObjects.clickeCard_Checker();
	}
	
	@Then("^user should be direct to ecardchecker page with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_ecardchecker_page_with_popup_window(String ecardcheckerPopUp) throws Throwable {
		Assert.assertEquals("PopUp Window validation", ecardcheckerPopUp,driver.getCurrentUrl());
		Thread.sleep(10000);
	}
	
	//********************OrderAndPayment******************//
	
	@When("^user click on Order And Payment link$")
	public void user_click_on_Order_And_Payment_link() throws Throwable {
		popupsLoadPgObjects		=new PopupsLoadPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		popupsLoadPgObjects.clickOrderAndPayment();
	}
	

	@Then("^user should be direct to Order And Payment page with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_Order_And_Payment_page_with_popup_window(String OrderAndPaymentpopupURL) throws Throwable {
		Assert.assertEquals("PopUp Window validation", OrderAndPaymentpopupURL,driver.getCurrentUrl());
		Thread.sleep(10000);
	}
	
	//********************Track Shipment******************//
	
	@When("^user click on Track Shipment link$")
	public void user_click_on_Track_Shipment_link() throws Throwable {
		popupsLoadPgObjects		=new PopupsLoadPgObjects(driver);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		popupsLoadPgObjects.clickTrackShipment();
	}
	

	@Then("^user should be direct to Track Shipment page with popup window \"([^\"]*)\"$")
	public void user_should_be_direct_to_Track_Shipment_page_with_popup_window(String TrackShipmentpopupURL) throws Throwable {
		Assert.assertEquals("PopUp Window validation", TrackShipmentpopupURL,driver.getCurrentUrl());
		Thread.sleep(10000);
	}


}
