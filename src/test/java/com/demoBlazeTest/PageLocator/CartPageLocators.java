package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class CartPageLocators extends Base_Parent{

	public CartPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Place Order']")
	public WebElement placeOrderButton;
	@FindBy(how = How.XPATH, using = "//b[text()='About Us']")
	public WebElement aboutUsLabel;
	@FindBy(how = How.XPATH, using = "//b[text()='Get in Touch']")
	public WebElement getInTouchLabel;
	@FindBy(how = How.XPATH, using = "//th[text()='Pic']")
	public WebElement picLabel;
	@FindBy(how = How.XPATH, using = "//th[text()='Price']")
	public WebElement priceLabel;
	@FindBy(how = How.XPATH, using = "//th[text()='Title']")
	public WebElement titleLabel;
}
