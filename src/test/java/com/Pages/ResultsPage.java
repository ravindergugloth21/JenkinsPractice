package com.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.Runner.BaseClass;

public class ResultsPage extends BaseClass {

	
	
	public void verifyselect()
	{
		String Actual= driver.findElement(By.cssSelector("h1[class='pdp__name']")).getText();
		String Expected = "Petites Eloise Jean";
		Assert.assertEquals(Expected,Actual);
	}
}
