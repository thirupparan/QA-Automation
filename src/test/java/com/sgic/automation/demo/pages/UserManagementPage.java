package com.sgic.automation.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserManagementPage extends BasePage{
	
	//private WebElement lblHeader = driver.findElement(By.xpath("//*[@id=\"systemUser-information\"]/div[1]/h1"));
	 private WebElement lblHead = driver.findElement(By.xpath("//*[@id=\"systemUser-information\"]/div[1]/h1"));
	public UserManagementPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean isDashboardDisplayed () {
        boolean flag;
        try {
        	lblHead.isDisplayed();
            flag = true;
        }catch (Exception e)  {
            flag = false;
        }
        return flag;
    }
}
