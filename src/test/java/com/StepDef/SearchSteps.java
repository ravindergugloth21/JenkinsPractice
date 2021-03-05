package com.StepDef;

import com.Runner.BaseClass;

import cucumber.api.java.en.When;

public class SearchSteps extends BaseClass {
	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String Keyword) throws Throwable {
		searchPage.Search(Keyword);
	    
	}

	@When("^I click on particular jeans$")
	public void i_click_on_particular_jeans() throws Throwable {
		searchPage.select();
	    
	}

}
