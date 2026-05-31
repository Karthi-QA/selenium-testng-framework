package TestClasses;

import com.testng.framework.BaseClasses.*;
import com.testng.framework.PageClasses.*;
import com.testng.framework.UtilityClasses.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cartTest extends baseTest {

    public dashboardPage doLogin() {
        loginPage login = new loginPage(driverManager.getDriver());
        return login.enterUsername(configReader.get("username"))
                    .enterPassword(configReader.get("password"))
                    .clickLogin();
    }

    @Test(description = "Adding one product should show badge count as 1")
    public void testAddOneProductToCart() {
        dashboardPage dashboard = doLogin();
        dashboard.addFirstProductToCart();
        cartPage cart = dashboard.goToCart();
        Assert.assertEquals(cart.getCartItemCount(), 1);
        System.out.println("Added single item to cart");
    }

    @Test(description = "Adding multiple products should reflect correct count")
    public void testAddMultipleProductsToCart() {
        dashboardPage dashboard = doLogin();
        dashboard.addMultipleProductsToCart(3);
        cartPage cart = dashboard.goToCart();
        Assert.assertEquals(cart.getCartItemCount(), 3);
        System.out.println("Added multiple items to cart");
    }

    @Test(description = "Removing item from cart should reduce count")
    public void testRemoveProductFromCart() {
        dashboardPage dashboard = doLogin();
        dashboard.addMultipleProductsToCart(2);
        cartPage cart = dashboard.goToCart();
        cart.removeFirstItem();
        Assert.assertEquals(cart.getCartItemCount(), 1);
        System.out.println("Items are removed from cart");
    }
}