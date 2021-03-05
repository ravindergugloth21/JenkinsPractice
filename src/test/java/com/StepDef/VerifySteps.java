package com.StepDef;

import com.Runner.BaseClass;

import cucumber.api.java.en.Then;

public class VerifySteps extends BaseClass {
	@Then("^I should be able to see it in page$")
	public void i_should_be_able_to_see_it_in_page() throws Throwable {
	    
		resultsPage.verifyselect();
	}
}
