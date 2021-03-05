package com.StepDef;

import com.runner.BaseClass;

import cucumber.api.java.en.When;

public class SearchPageStepDef extends BaseClass {
	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String product) throws Throwable {
		searchPage.searchProduct(product);
	   
	}

}
