package tests;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

       
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

  
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("inventory"));

        System.out.println("Login successful. Now on Products Page");

        
        ProductsPage products = new ProductsPage(driver);

        products.addProductToCart();
        products.goToCart();
       
        
        //wait for the cart page properly
        
       System.out.println("Current URL after cart click:" + driver.getCurrentUrl());
       
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));
        
        CartPage cart = new CartPage(driver);
        cart.clickCheckout();
        
        System.out.println("checkout clicked successfully");
        
        // Checkout page
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.completeCheckout("varun", "reddy","516390");
        
        System.out.println("Checkout completed successfully");
        
        
        
        
    }
}