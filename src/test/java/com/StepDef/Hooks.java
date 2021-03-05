package com.StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.runner.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	
	public static String URL="https://www.thereformation.com/";
	
	@Before
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[class='backToShop glDefaultBtn ']")).click();
		driver.findElement(By.cssSelector("button[class='button button--gdpr']")).click();
		

		
	}
	@After
	public void tearDown()
	{
		
	}

}
