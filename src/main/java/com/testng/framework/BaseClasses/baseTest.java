package com.testng.framework.BaseClasses;

import java.sql.DriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.testng.framework.UtilityClasses.*;

public class baseTest {

	@BeforeMethod
	public void setUp() {
		String browser = configReader.get("browser");
		driverManager.initDriver(browser);
		driverManager.getDriver().get(configReader.get("baseUrl"));
	}

	@AfterMethod
	public void tearDown() {
		driverManager.quitDriver();
	}
}