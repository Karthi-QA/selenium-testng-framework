# Selenium TestNG Automation Framework

A scalable UI test automation framework built with Selenium WebDriver,
TestNG and Page Object Model (POM) in Java.

## Tech Stack

- Java 11
- Selenium WebDriver 4.x
- TestNG 7.x
- WebDriverManager
- Maven

## Framework Highlights

- Page Object Model (POM) design pattern
- ThreadLocal WebDriver for parallel execution
- Config-driven via config.properties
- TestNG XML suite management

## Project Structure

src/
├── main/java/com/testng/framework/
│ ├── base/BaseTest.java
│ ├── pages/LoginPage.java
│ ├── pages/DashboardPage.java
│ ├── pages/CartPage.java
│ └── utils/DriverManager.java
│ └── utils/ConfigReader.java
└── test/java/TestClasses/
├── LoginTest.java
├── DashboardTest.java
└── CartTest.java

## How to Run

mvn clean test -DsuiteXmlFile=src/test/resources/testng.xml

## Test Coverage

| Module    | Tests                              |
| --------- | ---------------------------------- |
| Login     | Valid login, Invalid login         |
| Dashboard | Page title, Product count          |
| Cart      | Add one, Add multiple, Remove item |
