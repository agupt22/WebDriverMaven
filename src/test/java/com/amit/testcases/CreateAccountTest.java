package com.amit.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.amit.base.Page;
import com.amit.pages.ZohoAppPage;
import com.amit.pages.crm.accounts.AccountsPage;
import com.amit.pages.crm.accounts.CreateAccountPage;
import com.amit.utilities.Utilities;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void createAccountTest(Hashtable<String, String> data) {
		
		ZohoAppPage zohoAppPage = new ZohoAppPage();
		zohoAppPage.goToCRM();
		AccountsPage accountsPage = Page.menu.goToAccounts();
		
		CreateAccountPage createAccountPage = accountsPage.goToCreateAccounts();
		createAccountPage.createAccount(data.get("accountname"));
		
	}

}
