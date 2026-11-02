package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;



public class CartPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath = "//button[@id='checkout']")
	WebElement checkoutBtn;
	
	public CartPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	
	public void clickCheckout()
	{
		
		wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
		wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
		
		System.out.println("Clicking Checkout Button...");
		
		checkoutBtn.click();
	}

}
