package com.Pages;

import org.junit.Assert;

import com.Runner.BaseClass;

public class Homepage  extends BaseClass {
	
	public void verifyhomepage()
	{
		Assert.assertEquals("https://www.thereformation.com/", driver.getCurrentUrl());
	}

}
