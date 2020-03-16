package com.amit.pages.crm.accounts;

import org.openqa.selenium.By;

import com.amit.base.Page;

public class CreateAccountPage extends Page{
	
	public void createAccount(String accountName) {
		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(accountName);
	}

}
