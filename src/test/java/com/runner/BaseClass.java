package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.ResultsPage;
import com.pages.SearchPage;

public class BaseClass {
	public static WebDriver driver;
	public static HomePage homePage=new HomePage();
	public static SearchPage searchPage=new SearchPage();
	public static ResultsPage resultsPage=new ResultsPage();
	
	
	

}
