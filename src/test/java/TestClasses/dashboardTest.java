package TestClasses;

import com.testng.framework.BaseClasses.*;
import com.testng.framework.PageClasses.*;
import com.testng.framework.UtilityClasses.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dashboardTest extends baseTest {

	@Test(description = "Dashboard should display Products title after login")
	public void testDashboardTitle() {
		loginPage login = new loginPage(driverManager.getDriver());
		dashboardPage dashboard = login.enterUsername(configReader.get("username"))
				.enterPassword(configReader.get("password")).clickLogin();
		Assert.assertEquals(dashboard.getPageTitle(), "Products");
		System.out.println("DashBoard title: "+dashboard.getPageTitle());
	}

	@Test(description = "Dashboard should display 6 products")
	public void testProductCount() {
		loginPage login = new loginPage(driverManager.getDriver());
		dashboardPage dashboard = login.enterUsername(configReader.get("username"))
				.enterPassword(configReader.get("password")).clickLogin();
		Assert.assertEquals(dashboard.getProductCount(), 6);
		System.out.println("DashBoard products count: "+dashboard.getProductCount());
	}
}