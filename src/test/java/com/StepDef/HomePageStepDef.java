package com.StepDef;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;

public class HomePageStepDef extends BaseClass{
	@Given("^I am on Home Page$")
	public void i_am_on_Home_Page() throws Throwable {
		homePage.verifyHomePage();
	    
	}

	

	

}
