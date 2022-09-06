package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class SuccessfulMessageValidationPage {

	WebDriver driver;

	// Initializing the WebElements locator Values using FindBy class.
	@FindBy(how = How.XPATH, using = "//*[@id=\"rightPanel\"]/p")
	@CacheLookup
	WebElement SuccRegMsgValidation;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Log Out']")
	WebElement logout;

	public SuccessfulMessageValidationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Validating Successful User Registration Message.
	public void validateSuccessfulRegMessage() {

		String expSuccRegMsg = "Your account was created successfully.";
		String actSuccRegMsg = SuccRegMsgValidation.getText();

		String retrievedMsg[] = actSuccRegMsg.split("\\.");
		String successdulMsg = retrievedMsg[0];

		if (actSuccRegMsg.contains(expSuccRegMsg)) {

			Reporter.log("The Actual and Expected Message of Successful User Registration are Same.");
			Reporter.log("The Successful user Registration Message is validated.");
			Reporter.log("The Successful Registration Message is " + successdulMsg + ".");

		} else {

			Reporter.log("The Actual and Expected Message of Successful User Registration are not Same.");
			Reporter.log("The Actual Message of Successful User Registration is " + actSuccRegMsg + ".");
			Reporter.log("The Expected Message of Successful User Registration is " + expSuccRegMsg + ".");

		}

	}

	// Clicking on logout.
	public void clickLogout() {

		logout.click();
		Reporter.log("User is logged out.");

	}

}
