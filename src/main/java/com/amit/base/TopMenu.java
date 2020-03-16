package com.amit.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}
	
public void goToHome() {
		
	}
	
	public void goToLeads() {
	
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	} 
	
	public AccountsPage goToAccounts() {
		
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		return new AccountsPage();
	}
	
	public void signOut() {
		
	}

}
