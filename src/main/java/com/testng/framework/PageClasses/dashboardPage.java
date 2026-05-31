package com.testng.framework.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class dashboardPage {

    private WebDriver driver;

    // Locators
    private By pageTitle      = By.className("title");
    private By productList    = By.className("inventory_item");
    private By addToCartBtns  = By.xpath("//button[text()='Add to cart']");
    private By sortDropdown   = By.className("product_sort_container");

    public dashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoaded() {
        return driver.findElement(pageTitle)
                     .getText().equalsIgnoreCase("Products");
    }

    public int getProductCount() {
        return driver.findElements(productList).size();
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public void addFirstProductToCart() {
        List<WebElement> buttons = driver.findElements(addToCartBtns);
        if (!buttons.isEmpty()) {
            buttons.get(0).click();
        }
    }

    public void addMultipleProductsToCart(int count) {
        List<WebElement> buttons = driver.findElements(addToCartBtns);
        for (int i = 0; i < count && i < buttons.size(); i++) {
            buttons.get(i).click();
        }
    }

    public cartPage goToCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
        return new cartPage(driver);
    }
}