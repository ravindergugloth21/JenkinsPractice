package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Runner.BaseClass;

public class SearchPage extends BaseClass {
	private static By Search_Box = By.cssSelector("input[id='storefront_search']");
	private static By Search_Button = By.cssSelector("a[class='primary-nav__link primary-nav__link--search']");

	public void Search(String Search)
	{
		driver.findElement(Search_Button).click();
		driver.findElement(Search_Box).sendKeys(Search);
	}
		public void select()
		{
	List <WebElement>	Options= driver.findElements(By.cssSelector("div[class='ui-menu-item-wrapper']"));
	
	for (WebElement Option:Options)
	{
		if(Option.getText().contains("Petites Eloise Jean"))
		{ Option.click();
		break;
		}
		
	}
		
	}
}
