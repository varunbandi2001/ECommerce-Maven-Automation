package pages;



import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;


public class ProductsPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
	WebElement addToCartBtn;
	
	@FindBy(className = "shopping_cart_link")
	WebElement cartIcon;
	
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		}
	
	public void addProductToCart() {
		wait.until(ExpectedConditions.visibilityOf(addToCartBtn));
		wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
		
		addToCartBtn.click();
		
		
	}
	public void goToCart()
	{
		wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
		cartIcon.click();
	}
}