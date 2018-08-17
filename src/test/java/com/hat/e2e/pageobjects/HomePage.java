package com.hat.e2e.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		if (!"Home".equals(webDriver.getTitle())) {
			throw new IllegalStateException("Expected Home page not displayed");
		}
	}
}
