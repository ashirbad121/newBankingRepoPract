package com.banking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScript3Test {

	public WebDriver driver;
	@Test(groups = "smoke")
	public void ts1Test()
	{
		System.out.println("---Test script-1----");
		String BROWSER = System.getProperty("browser");
		String URL=System.getProperty("url");
		
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		driver.get(URL);
			
		}
	
	/*@Test(groups="regression")
	public void ts2Test()
	{
		System.out.println("---Test script-2----");
		System.out.println("changes");
		
		System.out.println("hiiiii");
		System.out.println("hiiiii");
		
		System.out.println("hellooo");
	}*/
}
