package com.amit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.base.Page;

public class LoginPage extends Page{
	
	//public WebDriver driver;

	
	public ZohoAppPage doLogin(String userName , String password) throws InterruptedException {
		
		//driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys(userName);
		type("userName_XPATH", userName);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		click("nextbtn_XPATH");
		
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		type("password_XPATH", password);
		Thread.sleep(2000);
		click("nextbtn_XPATH");
		
		//driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']")).click();
		
		return new ZohoAppPage();
	}
	
	public void goToForgotPassword() {
		
	}
	
	public void clickOnSignInUsingGoogle() {
		
	}
	
	public void clickOnSignUpNow() {
		
	}

}
