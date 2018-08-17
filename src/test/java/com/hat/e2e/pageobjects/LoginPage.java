package com.hat.e2e.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver webDriver;

	private By usernameLocator = By.id("hat-login-username");
	private By passwordLocator = By.id("hat-login-password");
	private By loginButtonLocator = By.id("hat-login-button");

	public LoginPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		if (!"Login".equals(webDriver.getTitle())) {
			throw new IllegalStateException("Expected Login page not displayed");
		}
	}

	public LoginPage typeUsername(String username) {
		webDriver.findElement(usernameLocator).sendKeys(username);
		return this;
	}

	public LoginPage typePassword(String password) {
		webDriver.findElement(passwordLocator).sendKeys(password);
		return this;
	}

	public HomePage submitLogin() {
		webDriver.findElement(loginButtonLocator).click();
		return new HomePage(webDriver);
	}

}
