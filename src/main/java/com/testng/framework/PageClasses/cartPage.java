package com.testng.framework.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {

    private WebDriver driver;

    // Locators
    private By cartIcon        = By.className("shopping_cart_link");
    private By cartItems       = By.className("cart_item");
    private By removeButton    = By.xpath("//button[text()='Remove']");
    private By checkoutButton  = By.id("checkout");
    private By cartBadge       = By.className("shopping_cart_badge");

    public cartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCartIcon() {
        driver.findElement(cartIcon).click();
    }

    public int getCartItemCount() {
        return driver.findElements(cartItems).size();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void removeFirstItem() {
        driver.findElement(removeButton).click();
    }

    public String getCartBadgeCount() {
        return driver.findElement(cartBadge).getText();
    }
}