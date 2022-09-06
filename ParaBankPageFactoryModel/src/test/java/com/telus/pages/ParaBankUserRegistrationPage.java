package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class ParaBankUserRegistrationPage {

	WebDriver driver;

	// Initializing the WebElements locator Values using FindBy class.
	@FindBy(how = How.XPATH, using = "//input[@id='customer.firstName']")
	@CacheLookup
	WebElement firstNameTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.lastName']")
	@CacheLookup
	WebElement lastNameTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.street']")
	@CacheLookup
	WebElement addressTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.city']")
	@CacheLookup
	WebElement cityTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.state']")
	@CacheLookup
	WebElement stateTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.address.zipCode']")
	@CacheLookup
	WebElement zipCodeTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.phoneNumber']")
	@CacheLookup
	WebElement phoneTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.ssn']")
	@CacheLookup
	WebElement ssnTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.username']")
	@CacheLookup
	WebElement userNameTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='customer.password']")
	@CacheLookup
	WebElement passwordTBox;

	@FindBy(how = How.XPATH, using = "//input[@id='repeatedPassword']")
	@CacheLookup
	WebElement confirmPasswordTBox;

	@FindBy(how = How.XPATH, using = "//input[@value='Register']")
	@CacheLookup
	WebElement registerButton;

	public ParaBankUserRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	// First Name Text Box.
	public void setFirstName(String firstName) {

		firstNameTBox.sendKeys(firstName);
		Reporter.log("The user First Name is " + firstName + ".");

	}

	// Last Name Text Box.
	public void setLastName(String lastName) {

		lastNameTBox.sendKeys(lastName);
		Reporter.log("The user Last Name is " + lastName + ".");

	}

	// Address Text Box.
	public void setAddress(String address) {

		addressTBox.sendKeys(address);
		Reporter.log("The user Address is " + address + ".");

	}

	// City Text Box.
	public void setCity(String city) {

		cityTBox.sendKeys(city);
		Reporter.log("The user City is " + city + ".");

	}

	// State Text Box.
	public void setState(String state) {

		stateTBox.sendKeys(state);
		Reporter.log("The user State is " + state + ".");

	}

	// ZipCode Text Box.
	public void setZipCode(String zipCode) {

		zipCodeTBox.sendKeys(zipCode);
		Reporter.log("The user Zip Code is " + zipCode + ".");

	}

	// Phone Text Box.
	public void setPhone(String phone) {

		phoneTBox.sendKeys(phone);
		Reporter.log("The user Phone Number is " + phone + ".");

	}

	// SSN Text Box.
	public void setSsn(String ssn) {

		ssnTBox.sendKeys(ssn);
		Reporter.log("The user SSN is " + ssn + ".");

	}

	// User Name Text Box.
	public void setUserName(String userName) {

		userNameTBox.sendKeys(userName);
		Reporter.log("The user Name is " + userName + ".");

	}

	// Password Text Box.
	public void setPassword(String password) {

		passwordTBox.sendKeys(password);
		Reporter.log("The user confirmation Password is " + password + ".");

	}

	// Confirm Password Text Box.
	public void setConfirmPassword(String confPassword) {

		confirmPasswordTBox.sendKeys(confPassword);
		Reporter.log("The user Password is " + confPassword + ".");

	}

	// Register Button.
	public void clickRegisterButton() {

		registerButton.click();
		Reporter.log("Register Button is clicked.");

	}

}
