package com.amit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.base.Page;

public class HomePage extends Page{
	
	
	public void goToFreeSignUpPage() {
		//a[@class='zh-signup']
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}
	
	public LoginPage goToLogin() {
		
		click("loginLink_XPATH");
		
		return new LoginPage();
	}
	
	public void goToSupport() {
		
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}
	
	public void goToContactSales() {
		
	}
	
	

}
