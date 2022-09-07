package com.telus.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.telus.pages.ParaBankHomePage;
import com.telus.pages.ParaBankUserRegistrationPage;
import com.telus.pages.SuccessfulMessageValidationPage;


public class ParaBankUserRegistrationEndToEndTest {
 
	// Parameterization of input values.
	String firstNameValue = "Salman";
	String lastNameValue = "Raza";
	String addressValue = "Siwan";
	String cityValue = "Siwan";
	String stateValue = "Bihar";
	String zipCodeValue = "841226";
	String phoneValue = "9586420032";
	String ssnValue = "841226123";
	String userNameValue = "lion";
	String passwordValue = "1234567";
	String confirmPasswordValue = "1234567";
	
	
	public WebDriver driver;

	// Launching the ParaBank Home Page.
	@Test(priority = 1)
	public void launchApplication() {

		// Setting the system property for the ChromeDriver.
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// Creating instance of ChromeDriver.
		driver = new ChromeDriver();

		String url = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";

		// Launching the application.
		driver.get(url);

		// Maximizing the window.
		driver.manage().window().maximize();
		
		Reporter.log("Application is launched.");

	}

	// clicking on Register Text Link.
	@Test(priority = 2)
	public void clickRegisterLink() {

		// Creating Instance of ParaBankHomePage.
		ParaBankHomePage home = PageFactory.initElements(driver, ParaBankHomePage.class);
		home.clickRegister();
	

	}


	// Registering New User
	@Test(priority = 3)
	public void registerUser() {

	// Creating Instance of ParaBankUserRegistrationPage.
    ParaBankUserRegistrationPage registerUser = PageFactory.initElements(driver, ParaBankUserRegistrationPage.class);

    // Calling methods().
    registerUser.setFirstName(firstNameValue);
    registerUser.setLastName(lastNameValue);
    registerUser.setAddress(addressValue);
    registerUser.setCity(cityValue);
    registerUser.setState(stateValue);
    registerUser.setZipCode(zipCodeValue);
    registerUser.setPhone(phoneValue);
    registerUser.setSsn(ssnValue);
    registerUser.setUserName(userNameValue);
    registerUser.setPassword(passwordValue);
    registerUser.setConfirmPassword(confirmPasswordValue);
    registerUser.clickRegisterButton();
	
	}

	// validating Successful Message of User Registration.
	@Test(priority = 4)
	public void successfulMsgValidation() {

		// Creating Instance of SuccessfulMessageValidationPage.
		SuccessfulMessageValidationPage succMsgValidation = PageFactory.initElements(driver, SuccessfulMessageValidationPage.class);

		succMsgValidation.validateSuccessfulRegMessage();
		
		succMsgValidation.clickLogout();
	}

	// closing the Application.
	@Test(priority = 5)
	public void closeApplication() {

				driver.close();

		Reporter.log("Application is closed.");

	}

}
