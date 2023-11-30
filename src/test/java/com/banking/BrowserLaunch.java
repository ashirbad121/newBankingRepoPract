package com.banking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunch {

	WebDriver driver;
	@Test
	
	public void m1Test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
}
