package TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testng.framework.BaseClasses.baseTest;
import com.testng.framework.PageClasses.dashboardPage;
import com.testng.framework.PageClasses.loginPage;
import com.testng.framework.UtilityClasses.configReader;
import com.testng.framework.UtilityClasses.driverManager;

public class loginTest extends baseTest {

	@Test(description = "Valid login should land on dashboard")
	public void testValidLogin() {
		loginPage login = new loginPage(driverManager.getDriver());
		login.enterUsername(configReader.get("username"));
		login.enterPassword(configReader.get("password"));
		dashboardPage dashboard = login.clickLogin();
		Assert.assertTrue(dashboard.isLoaded(), "Dashboard did not load");
		System.out.println("Login successfull");
	}

	@Test(description = "Invalid login should show error")
	public void testInvalidLogin() {
		loginPage login = new loginPage(driverManager.getDriver());
		login.enterUsername("wrong_user");
		login.enterPassword("wrong_pass");
		login.clickLogin();
		Assert.assertTrue(login.getErrorMessage().contains("Username and password do not match"));
		System.out.println("Login unsuccessfull");
	}
}