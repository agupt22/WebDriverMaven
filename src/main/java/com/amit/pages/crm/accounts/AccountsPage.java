package com.amit.pages.crm.accounts;

import org.openqa.selenium.By;

import com.amit.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage goToCreateAccounts() {
		
		driver.findElement(By.xpath("//button[contains(@class,'newwhitebtn customPlusBtn')]")).click();
		return new CreateAccountPage();
		
	}

public void goToImportAccounts() {
	
	driver.findElement(By.xpath("//input[@id='importButton']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Import Accounts')]")).click();
		
	}
}
