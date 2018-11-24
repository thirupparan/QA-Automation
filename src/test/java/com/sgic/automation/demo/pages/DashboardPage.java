package com.sgic.automation.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage{

    private WebElement lblHeader = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
    private WebElement menuAdmin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
    
    public DashboardPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

     public boolean isDashboardDisplayed () {
        boolean flag;
        try {
            lblHeader.isDisplayed();
            flag = true;
        }catch (Exception e)  {
            flag = false;
        }
        return flag;
    }
    
     public UserManagementPage navigateUserManagement() {            
            menuAdmin.click();
            return new UserManagementPage(driver);
        }
}