package com.amit.testcases;

import org.testng.annotations.AfterSuite;

import com.amit.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page.quit();
	}

}
