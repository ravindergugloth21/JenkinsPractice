package com.Runner;

import org.openqa.selenium.WebDriver;

import com.Pages.Homepage;
import com.Pages.ResultsPage;
import com.Pages.SearchPage;

public class BaseClass {

	 public static WebDriver driver;
	 public static Homepage homepage = new  Homepage();
	 public static SearchPage searchPage = new SearchPage();
	 public static ResultsPage resultsPage = new ResultsPage();
}
