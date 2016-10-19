package com.steps;

import java.util.Set;

import com.titanium.core.BasicPgObject;
import com.titanium.core.Driver;
import com.voone.pgobjects.Online_DashBoardPgObject;


import cucumber.api.java.en.Then;

public class ValidateIRsCmenuFunctionality extends BasicPgObject {
	
	Online_DashBoardPgObject online_DashBoardPgObject ;

	
	public ValidateIRsCmenuFunctionality(Driver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Then("^click on cmenu$")
	public void click_on_cmenu() throws Throwable {
		System.out.println(driver.getCurrentUrl());
		/*Set<String> set = driver.getWindowHandles();
		driver.switchTo().window((String) set.toArray()[1]).close();
		driver.switchTo().window((String) set.toArray()[0]);*/
	
		Thread.sleep(1000);

		online_DashBoardPgObject= new Online_DashBoardPgObject(driver);
		System.out.println(driver.getCurrentUrl());
	
	
		
	
		online_DashBoardPgObject.checkCmenu();
	}
}
