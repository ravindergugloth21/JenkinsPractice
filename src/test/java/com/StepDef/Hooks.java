package com.StepDef;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass {
	
	private static By GDPR = By.cssSelector("button[class='button button--gdpr']");
	
	private static  String Base_URL = "https://www.thereformation.com/";
	private static By Cookies = By.cssSelector("input[data-key='continueShop']");

	@Before
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(Base_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(Cookies).click();
		driver.findElement(GDPR).click();
		
	}
	@After
	public void teardown()
	{
		driver.close();
	}
}
