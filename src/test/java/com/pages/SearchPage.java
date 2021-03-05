package com.pages;

import org.openqa.selenium.By;
import com.runner.BaseClass;

public class SearchPage extends BaseClass {
	public void searchProduct(String product)
	{
		driver.findElement(By.cssSelector("a[class='primary-nav__link primary-nav__link--search']")).click();
		driver.findElement(By.cssSelector("input[id='storefront_search']")).sendKeys(product);
		driver.findElement(By.cssSelector("div[class='ui-menu-item-wrapper']")).click();
	}

}
