package com.sgic.automation.demo.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

	protected static WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
}
