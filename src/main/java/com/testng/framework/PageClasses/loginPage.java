package com.testng.framework.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	private WebDriver driver;

	// Locators
	private By usernameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.cssSelector(".error-message-container h3");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Returns LoginPage (this) so we can chain methods
	public loginPage enterUsername(String username) {
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
		return this;
	}

	// Returns LoginPage (this) so we can chain methods
	public loginPage enterPassword(String password) {
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
		return this;
	}

	public dashboardPage clickLogin() {
		driver.findElement(loginButton).click();
		return new dashboardPage(driver);
	}

	public String getErrorMessage() {
		return driver.findElement(errorMessage).getText();
	}
}