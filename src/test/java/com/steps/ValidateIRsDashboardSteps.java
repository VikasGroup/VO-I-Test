package com.steps;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.voone.pgobjects.Online_DashBoardPgObject;
import com.voone.pgobjects.PopupsLoadPgObjects;

import cucumber.api.java.en.Then;

public class ValidateIRsDashboardSteps extends BasicTest {
	
	Online_DashBoardPgObject online_DashBoardPgObject; 
	PopupsLoadPgObjects popupsLoadPgObjects;
	
	@Then("^check IR name$")
	public void check_IR_name() throws Throwable {
		
	  
	}

	@Then("^check IRs last login$")
	public void check_IRs_last_login() throws Throwable {
	    
	  
	}

	@Then("^check status of member ship$")
	public void check_status_of_member_ship() throws Throwable {
	    
	  
	}

	@Then("^check Pay Rank$")
	public void check_Pay_Rank() throws Throwable {
	    
	  
	}

	@Then("^check Title Rank$")
	public void check_Title_Rank() throws Throwable {
	    
	  
	}

	@Then("^validate the notification$")
	public void validate_the_notification() throws Throwable {
		Thread.sleep(2000);
		  Assert.assertEquals(driver.getCurrentUrl(), "https://portal.qntest.com/VirtualOffice/onlineestore/NonRenewedIRNotice.aspx");
		
	  
	}

	@Then("^validate q-acc bal$")
	public void validate_q_acc_bal() throws Throwable {
	    
	  
	}

	@Then("^verify IR banner$")
	public void verify_IR_banner() throws Throwable {
	    
	  
	}

	@Then("^verify Retail customer banner$")
	public void verify_Retail_customer_banner() throws Throwable {
	    
	  
	}

	@Then("^verify QNET official facebook page$")
	public void verify_QNET_official_facebook_page() throws Throwable {
		
		String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			driver.switchTo().window((String) set.toArray()[1]).close();
			driver.switchTo().window(base);
			Thread.sleep(1000);
		popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
		popupsLoadPgObjects.clickClose();
		Thread.sleep(1000);
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		System.out.println(driver.getCurrentUrl());
	  online_DashBoardPgObject.clickfb();
	  Thread.sleep(2000);
	  
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    driver.switchTo().window(tabs2.get(0)).close();
	    Thread.sleep(2000);
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(1000);
	    Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/QNetEgyptOfficial");
	}

	@Then("^verify QNET AR Twitter page$")
	public void verify_QNET_AR_Twitter_page() throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window(base);
		Thread.sleep(1000);
	popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
	popupsLoadPgObjects.clickClose();
	Thread.sleep(1000);
	online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
	System.out.println(driver.getCurrentUrl());
  online_DashBoardPgObject.clickTwitterAR();
  Thread.sleep(2000);
  
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(0));
    driver.switchTo().window(tabs2.get(0)).close();
    Thread.sleep(2000);
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(1000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/qnetarabic");
	}

	@Then("^verify QNET official Twitter page$")
	public void verify_QNET_official_Twitter_page() throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window(base);
		Thread.sleep(1000);
	popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
	popupsLoadPgObjects.clickClose();
	Thread.sleep(1000);
	online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
	System.out.println(driver.getCurrentUrl());
  online_DashBoardPgObject.clickTwitter();
  Thread.sleep(2000);
  
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(0));
    driver.switchTo().window(tabs2.get(0)).close();
    Thread.sleep(2000);
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(1000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/QNetOfficial");
	}

	@Then("^verify Qbuzz page$")
	public void verify_Qbuzz_page() throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window(base);
		Thread.sleep(1000);
	popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
	popupsLoadPgObjects.clickClose();
	Thread.sleep(1000);
	online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
	System.out.println(driver.getCurrentUrl());
  online_DashBoardPgObject.clickBlogger();
  Thread.sleep(2000);
  
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(0));
    driver.switchTo().window(tabs2.get(0)).close();
    Thread.sleep(2000);
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(1000);
    Assert.assertEquals(driver.getCurrentUrl(), "http://www.qbuzz.qnet.net/");
	}

	@Then("^verify QNET official Youtube page$")
	public void verify_QNET_official_Youtube_page() throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window(base);
		Thread.sleep(1000);
	popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
	popupsLoadPgObjects.clickClose();
	Thread.sleep(1000);
	online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
	System.out.println(driver.getCurrentUrl());
  online_DashBoardPgObject.clickUtube();
  Thread.sleep(2000);
  
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(0));
    driver.switchTo().window(tabs2.get(0)).close();
    Thread.sleep(2000);
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(1000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/user/qnetofficial");
	}

	@Then("^verify  QNET official Google plus page$")
	public void verify_QNET_official_Google_plus_page() throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window(base);
		Thread.sleep(1000);
	popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
	popupsLoadPgObjects.clickClose();
	Thread.sleep(1000);
	online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
	System.out.println(driver.getCurrentUrl());
  online_DashBoardPgObject.clickGplus();
  Thread.sleep(2000);
  
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(0));
    driver.switchTo().window(tabs2.get(0)).close();
    Thread.sleep(2000);
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(1000);
    Assert.assertEquals(driver.getCurrentUrl(), "https://plus.google.com/+QNETofficial");
	}

	@Then("^verify News and updates$")
	public void verify_News_and_updates() throws Throwable {
		String base = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window(base);
		Thread.sleep(1000);
	popupsLoadPgObjects = new PopupsLoadPgObjects(driver);
	popupsLoadPgObjects.clickClose();
	Thread.sleep(1000);
	online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
	System.out.println(driver.getCurrentUrl());
	
	}

	@Then("^verify functionality of BV counter$")
	public void verify_functionality_of_BV_counter() throws Throwable {
	    
	  
	}

}
