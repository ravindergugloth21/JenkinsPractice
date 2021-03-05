package com.pages;

import org.junit.Assert;


import com.runner.BaseClass;



public class ResultsPage extends BaseClass {
	public void searchResult()
	{
		Assert.assertEquals("https://www.thereformation.com/products/petites-christine-dress?color=Bordeaux",driver.getCurrentUrl());
	}

}
