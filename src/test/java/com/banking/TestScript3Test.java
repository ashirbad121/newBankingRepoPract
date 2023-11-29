package com.banking;

import org.testng.annotations.Test;

public class TestScript3Test {

	@Test(groups = "smoke")
	public void ts1Test()
	{
		System.out.println("---Test script-1----");
	}
	
	@Test(groups="regression")
	public void ts2Test()
	{
		System.out.println("---Test script-2----");
		System.out.println("changes");
		
		System.out.println("hiiiii");
	}
}
