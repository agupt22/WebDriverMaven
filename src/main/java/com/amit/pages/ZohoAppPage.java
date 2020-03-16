package com.amit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amit.base.Page;

public class ZohoAppPage extends Page{
	
	 //public WebDriver driver;


	public void goToCRM() {
		driver.findElement(By.xpath("//div[contains(text(),'CRM')]")).click();
		
	}
	
	public void goToConnect() {

		driver.findElement(By.xpath("//span[@class='_logo-connect _logo-x64 zod-app-logo']")).click();

	}

	public void goToCalendar() {

		driver.findElement(By.xpath("//div[@class='container zl-my']//div[2]//div[1]//a[1]")).click();

	}

	public void goToDesk() {

		driver.findElement(By.xpath("//span[@class='_logo-support _logo-x64 zod-app-logo']")).click();

	}

	public void goToCreator() {

	}

	public void goToCliq() {

	}

	public void goToMail() {

	}
	
	public void clickOnAllApps() {
		
	}

}
