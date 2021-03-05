package com.StepDef;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class ResultsPageStepDef extends BaseClass {
	@Then("^I should see dress related products$")
	public void i_should_see_dress_related_products() throws Throwable {
		resultsPage.searchResult();
	   
	}

}
