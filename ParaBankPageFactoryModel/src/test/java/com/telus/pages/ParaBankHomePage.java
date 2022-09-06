package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class ParaBankHomePage {

	WebDriver driver;

	// Initializing the WebElements locator Values using FindBy class.
	@FindBy(how = How.XPATH, using = "//*[@id=\"loginPanel\"]/p[2]/a")
	@CacheLookup
	WebElement register;

	public ParaBankHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Clicking on Register.
	public void clickRegister() {

		register.click();
		Reporter.log("Register Text link is clicked.");

	}

}
