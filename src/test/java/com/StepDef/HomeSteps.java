package com.StepDef;

import com.Runner.BaseClass;

import cucumber.api.java.en.Given;

public class HomeSteps extends BaseClass{
	@Given("^I am in Home page$")
	public void i_am_in_Home_page() throws Throwable {
	    homepage.verifyhomepage();
	}


}
