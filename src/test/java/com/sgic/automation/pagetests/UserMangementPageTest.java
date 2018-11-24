package com.sgic.automation.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgic.automation.demo.pages.DashboardPage;
import com.sgic.automation.demo.pages.LoginPage;
import com.sgic.automation.demo.pages.UserManagementPage;

public class UserMangementPageTest extends BaseTest {

	@Test
    public void veryfyLoadUserMangement() {
		LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = loginPage.login("Admin", "admin123");
        UserManagementPage userManagementPage = dashboardPage.navigateUserManagement();
        Assert.assertTrue(userManagementPage.isDashboardDisplayed());
    }
}
