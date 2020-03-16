package com.amit.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.amit.pages.HomePage;
import com.amit.pages.LoginPage;
import com.amit.pages.ZohoAppPage;
import com.amit.utilities.Utilities;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void loginTest(Hashtable<String, String> data) throws InterruptedException {
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = homePage.goToLogin();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ZohoAppPage zohoAppPage = loginPage.doLogin(data.get("username"), data.get("password"));
		
	}

}
