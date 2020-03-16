package com.amit.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amit.base.Page;
import com.amit.pages.HomePage;
import com.amit.pages.LoginPage;
import com.amit.pages.ZohoAppPage;
import com.amit.pages.crm.accounts.AccountsPage;
import com.amit.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		HomePage homePage = new HomePage();
		LoginPage loginPage = homePage.goToLogin();
		Thread.sleep(2000);
		ZohoAppPage zohoAppPage = loginPage.doLogin("amitgupta9530@gmail.com", "Cowgupta44@");
		zohoAppPage.goToCRM();
		AccountsPage accountsPage = Page.menu.goToAccounts();
		
		CreateAccountPage createAccountPage = accountsPage.goToCreateAccounts();
		createAccountPage.createAccount("Amit");
		
		//Page.driver.close();
	}
	

}
