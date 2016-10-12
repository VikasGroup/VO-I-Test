package com.steps;



import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import com.voone.pgobjects.Online_Login_VOPgObject;
import com.voone.pgobjects.loginPgObject;
import com.voone.pgobjects.qntestPgObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ValidateLoginPageSteps extends BasicTest {
	
	loginPgObject loginpgObject;
	qntestPgObject qntestpgObject;
	Online_Login_VOPgObject online_Login_VOPgObject;
	

	@Given("^User opens \"([^\"]*)\" home page$")
	public void user_opens_home_page(String plan) throws Throwable {
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
	 
	}

	@When("^User click on ir login$")
	public void user_click_on_ir_login() throws Throwable {
		qntestpgObject = new qntestPgObject(driver);
		qntestpgObject.clickIRLogiIn();
	}

	@When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_valid_and(String uname, String pwd) throws Throwable {
		online_Login_VOPgObject = new Online_Login_VOPgObject(driver);
		online_Login_VOPgObject.enterIRID(uname);
		online_Login_VOPgObject.enterPassword(pwd);
		Thread.sleep(2000);
		online_Login_VOPgObject.clickLogInBtn();
		
	}

	@Then("^User should able to login to the system$")
	public void user_should_able_to_login_to_the_system() throws Throwable {
	 Assert.assertEquals(driver.getCurrentUrl(), "https://portal.qntest.com/VirtualOffice/OnlineEStore/PopupsLoad.aspx");
	}
	
	@When("^click on vo_option \"([^\"]*)\"$")
	public void click_on_vo_option(String arg1) throws Throwable {
		 loginpgObject = new loginPgObject(driver);
		 Thread.sleep(9000);
		  if (arg1.equals("current")) {
			  loginpgObject.clickCurrentVirtualOffice();
			 Thread.sleep(1000);
		} 
	}

	@When("^select the language \"([^\"]*)\"$")
	public void select_the_language(String language) throws Throwable {	
	online_Login_VOPgObject = new Online_Login_VOPgObject(driver);
	online_Login_VOPgObject.selectLanguage(language);
	Thread.sleep(1000);
		
	}
	
	@Then("^User should not be able to login to the system$")
	public void user_should_not_be_able_to_login_to_the_system() throws Throwable {
		try{
			  
			   WebDriverWait wait = new WebDriverWait(driver, 4);
			   Alert alert = wait.until(ExpectedConditions.alertIsPresent());

			   //Accepting alert.
			   alert.accept();
			  
			}catch(Throwable e){
			   System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
			}
	}
	
	@When("^click on enrol as RC$")
	public void click_on_enrol_as_RC() throws Throwable {
		online_Login_VOPgObject = new Online_Login_VOPgObject(driver);
		online_Login_VOPgObject.clickLogRC();
	}

	@When("^check referrer \"([^\"]*)\"$")
	public void check_referrer(String arg1) throws Throwable {
	 
	}

	@When("^select country \"([^\"]*)\"$")
	public void select_country(String arg1) throws Throwable {
	  
	}

	@When("^click on shop button$")
	public void click_on_shop_button() throws Throwable {
	  
	}

}
