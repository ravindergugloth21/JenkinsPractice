package com.pages;


import org.junit.Assert;

import com.runner.BaseClass;


public class HomePage extends BaseClass{
	
	public void verifyHomePage()
	{
		
		
		Assert.assertEquals("https://www.thereformation.com/", driver.getCurrentUrl());
	}

}
