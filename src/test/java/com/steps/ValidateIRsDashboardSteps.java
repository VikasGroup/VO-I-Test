package com.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Set;
import java.util.TimeZone;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.voone.pgobjects.Online_DashBoardPgObject;
import com.voone.pgobjects.PopupsLoadPgObjects;

import cucumber.api.java.en.Then;

public class ValidateIRsDashboardSteps extends BasicTest {

	Online_DashBoardPgObject online_DashBoardPgObject;
	PopupsLoadPgObjects popupsLoadPgObjects;

	@Then("^check IRs last login$")
	public void check_IRs_last_login() throws Throwable {
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm");
		System.out.println("Current TimeZone:"+ cal.getTimeZone().getDisplayName());
		System.out.println(dateFormat.format(cal.getTime()));
		cal.setTimeZone(TimeZone.getTimeZone("Asia/Hong_Kong"));
		System.out.println("New TimeZone:" + cal.getTimeZone().getDisplayName());
		System.out.println(dateFormat.format(cal.getTime()));
		
		
		
	/*	DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));*/
	}

	@Then("^check IR name \"([^\"]*)\"$")
	public void check_IR_name(String arg1) throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		System.out.println(online_DashBoardPgObject.getName());
		Assert.assertEquals(arg1, online_DashBoardPgObject.getName());

	}

	@Then("^check status of membership \"([^\"]*)\"$")
	public void check_status_of_membership(String arg1) throws Throwable {
		Assert.assertEquals(arg1, online_DashBoardPgObject.getStatus());

	}

	@Then("^check main plan Pay Rank \"([^\"]*)\"$")
	public void check_main_plan_Pay_Rank(String arg1) throws Throwable {
		Assert.assertEquals(arg1, online_DashBoardPgObject.getmpRank());

	}

	@Then("^check main plan Title Rank \"([^\"]*)\"$")
	public void check_main_plan_Title_Rank(String arg1) throws Throwable {
		Assert.assertEquals(arg1, online_DashBoardPgObject.getmtRank());

	}

	@Then("^check rsp plan Pay Rank \"([^\"]*)\"$")
	public void check_rsp_plan_Pay_Rank(String arg1) throws Throwable {
		Assert.assertEquals(arg1, online_DashBoardPgObject.getrpRank());

	}

	@Then("^check rsp plan Title Rank \"([^\"]*)\"$")
	public void check_rsp_plan_Title_Rank(String arg1) throws Throwable {
		Assert.assertEquals(arg1, online_DashBoardPgObject.getrtRank());

	}

	@Then("^validate the notification$")
	public void validate_the_notification() throws Throwable {
		Thread.sleep(2000);
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://portal.qntest.com/VirtualOffice/onlineestore/NonRenewedIRNotice.aspx");

	}

	@Then("^enter q-acc pin \"([^\"]*)\"$")
	public void enter_q_acc_pin(String arg1) throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		System.out.println(driver.getCurrentUrl());
		online_DashBoardPgObject.enterqpin(arg1);
		online_DashBoardPgObject.clickValidate();
		
	}
	
	@Then("^validate q-acc bal$")
	public void validate_q_acc_bal() throws Throwable {
		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		online_DashBoardPgObject.checkQAbal();
	
		
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

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
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

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
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

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
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

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
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

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
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

		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		driver.switchTo().window(tabs2.get(0)).close();
		Thread.sleep(2000);
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
		Assert.assertEquals(driver.getCurrentUrl(), "https://plus.google.com/+QNETofficial");
	}

	@Then("^verify News and updates$")
	public void verify_News_and_updates() throws Throwable {
		Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window((String) set.toArray()[0]);
	
		Thread.sleep(1000);

		online_DashBoardPgObject = new Online_DashBoardPgObject(driver);
		Thread.sleep(1000);
		WebElement newsfeed = driver.findElement(By.xpath(".//*[@id='BusinessUpdatesNew1_lbMore']"));
		//WebElement newsfeed = driver.findElement(By.className("news-update")).findElement(By.className("box-content")).findElement(By.id("BusinessUpdatesNew1_lbMore"));
		newsfeed.click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		

	}
	
	@Then("^validate the news page$")
	public void validate_the_news_page() throws Throwable {
	
		Assert.assertEquals("https://portal.qntest.com/VirtualOffice/OnlineEStore/Online_Announcement.aspx",driver.getCurrentUrl());
	}

	@Then("^verify functionality of BV counter$")
	public void verify_functionality_of_BV_counter() throws Throwable {

	}

}
