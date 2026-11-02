package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class CheckoutPage {
	
	WebDriver driver;
	
	@FindBy( id = "first-name")
	WebElement firstName;
	
	@FindBy (id = "last-name")
	WebElement lastName;
	
	@FindBy (id = "postal-code")
	WebElement zip;
	
	@FindBy (id = "continue")
	WebElement continueBtn;
	
	@FindBy (id = "finish")
	WebElement finishBtn;
	
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	


	public void completeCheckout(String f, String l,String z)
	{
		firstName.sendKeys(f);
		lastName.sendKeys(l);
		zip.sendKeys(z);
		continueBtn.click();
		finishBtn.click();
	}

}
