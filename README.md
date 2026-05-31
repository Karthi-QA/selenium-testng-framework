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
Page = locators only. 
Test = assertions only. 
Base = setup only.
Utility = Configuration & Driver management

## How to Run

mvn clean test -DsuiteXmlFile=src/test/resources/testng.xml

## Test Coverage

| Module    | Tests                              |
| --------- | ---------------------------------- |
| Login     | Valid login, Invalid login         |
| Dashboard | Page title, Product count          |
| Cart      | Add one, Add multiple, Remove item |
