package com.steps;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import com.util.LanDetector;
import com.voone.pgobjects.ForgotPasswordApplyPassPgObject;
import com.voone.pgobjects.ForgotPasswordOptionsPgObect;
import com.voone.pgobjects.ForgotPasswordPostEmailPgObject;
import com.voone.pgobjects.ForgotpasswordPgObject;
import com.voone.pgobjects.LoginPgObject;
import com.voone.pgobjects.Online_Login_VOPgObject;
import com.voone.pgobjects.PopupsLoadPgObjects;
import com.voone.pgobjects.QntestPgObject;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ValidateLoginPageSteps extends BasicTest {
	 LanDetector lanDetector;
	QntestPgObject qntestPgObject;
	LoginPgObject loginPgObject;
	Online_Login_VOPgObject online_Login_VOPgObject;
	ForgotPasswordOptionsPgObect forgotPasswordOptionsPgObect;
	ForgotPasswordApplyPassPgObject forgotPasswordApplyPassPgObject;
	ForgotpasswordPgObject forgotpasswordPgObject;
	ForgotPasswordPostEmailPgObject forgotPasswordPostEmailPgObject;
	PopupsLoadPgObjects popupsLoadPgObjects;
	
	
	@Given("^User opens \"([^\"]*)\" home page$")
	public void user_opens_home_page(String plan) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
	 
	}

	@When("^User click on ir login$")
	public void user_click_on_ir_login() throws Throwable {
		qntestPgObject=new QntestPgObject(driver);
		qntestPgObject.clickIRLogiIn();
	}

	@When("^click on current virtual office$")
	public void click_on_current_virtual_office() throws Throwable {
		loginPgObject=new LoginPgObject(driver);
		loginPgObject.clickCurrentVirtualOffice();
	}

	@Then("^User should able to direct to Online_Login_VO page \"([^\"]*)\"$")
	public void user_should_able_to_direct_to_Online_Login_VO_page(String url) throws Throwable {
	   Assert.assertEquals("Validate Online_Login_VO_page", "https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx",url);
	}
	@Then("^Proceed to VO (\\d+) Login page$")
	public void proceed_to_VO_Login_page(int arg1) throws Throwable {
	   
	}

	@Then("^Enter credential \"([^\"]*)\" & \"([^\"]*)\"$")
	public void enter_credential(String user, String pass) throws Throwable {
		online_Login_VOPgObject=new Online_Login_VOPgObject(driver);
		online_Login_VOPgObject.enterIRID(user);
		online_Login_VOPgObject.enterPassword(pass);
	}

	@Then("^Click on login btn$")
	public void click_on_login_btn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		online_Login_VOPgObject.clickLogInBtn();
	}

	@Then("^validate msg$")
	public void validate_msg() throws Throwable {
		try{
		    
		     WebDriverWait wait = new WebDriverWait(driver, 4);
		     Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		     //Accepting alert.
		     alert.accept();
		    
		  }catch(Throwable e){
		     System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
		  }
	}
	@Then("^User should direct to PopupdLoad page \"([^\"]*)\"$")
	public void user_should_direct_to_PopupdLoad_page(String url) throws Throwable {
		//Set<String> set = driver.getWindowHandles();
		//driver.switchTo().window((String) set.toArray()[1]);
	    Assert.assertEquals("PopupsLoad pg validation", "https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx",url);
	}
	@Then("^Click on forgot password$")
	public void click_on_forgot_password() throws Throwable {
		online_Login_VOPgObject=new Online_Login_VOPgObject(driver);
	    online_Login_VOPgObject.clickForgotPass();
	}

	@Then("^Enter IRID \"([^\"]*)\"$")
	public void enter_IRID(String ir) throws Throwable {
	    forgotpasswordPgObject=new ForgotpasswordPgObject(driver);
	    forgotpasswordPgObject.EnterIRID(ir);
	}

	@Then("^Click on submit$")
	public void click_on_submit() throws Throwable {
		forgotpasswordPgObject.clickSubmit();
	}

	@Then("^Select email the code$")
	public void select_email_the_code() throws Throwable {
	   forgotPasswordOptionsPgObect=new ForgotPasswordOptionsPgObect(driver);
	   forgotPasswordOptionsPgObect.clickSendVerifyLink();
	}

	@Then("^Click continue$")
	public void click_continue() throws Throwable {
		forgotPasswordOptionsPgObect.clickContinueBtn();
	}

	@Then("^Validate Msg$")
	public void validate_Msg() throws Throwable {
		try{
		    
		     WebDriverWait wait = new WebDriverWait(driver, 4);
		     Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		     //Accepting alert.
		     alert.accept();
		    
		  }catch(Throwable e){
		     System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
		  }
	}
	@Then("^select SHOP NOW directly tickbox$")
	public void select_SHOP_NOW_directly_tickbox() throws Throwable {
	    online_Login_VOPgObject.clickShopNowDirectly();
	    Thread.sleep(5000);
	}

	@Then("^User should direct to products page \"([^\"]*)\"$")
	public void user_should_direct_to_products_page(String url) throws Throwable {
		System.out.println(url);
	    Assert.assertEquals("Products Page Validation", url,driver.getCurrentUrl());
	   
	   
	    
	}

@Then("^Change language to AR$")
public void change_language_to_AR() throws Throwable {
	online_Login_VOPgObject=new Online_Login_VOPgObject(driver);
	online_Login_VOPgObject.selectLanguage("ar");
}

@Then("^Validate language$")
public void validate_language() throws Throwable {
	Set<String> set = driver.getWindowHandles();
	driver.switchTo().window((String) set.toArray()[0]);
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(5000);
	 popupsLoadPgObjects=new PopupsLoadPgObjects(driver);
	    popupsLoadPgObjects.clickClose();
	    Thread.sleep(5000);
	    System.out.println(popupsLoadPgObjects.getTestFooter());
	lanDetector=new LanDetector();
	 Assert.assertEquals("AR Language validation", "ar", lanDetector.getLan(popupsLoadPgObjects.getTestFooter()));
}

}
