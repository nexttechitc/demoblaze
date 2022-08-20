package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class HomePageLocators extends Base_Parent{
	
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[text() = 'Log in']")
	public WebElement signInLink;
	@FindBy(how = How.XPATH, using = "//a[text() = 'Home ']")
	public WebElement homeButtonLink;
	@FindBy(how = How.XPATH, using = "//a[text() = 'Contact']")
	public WebElement contactButtonLink;
	@FindBy(how = How.XPATH, using = "//a[text() = 'About us']")
	public WebElement aboutUsButtonLink;
	@FindBy(how = How.XPATH, using = "//a[text() = 'Cart']")
	public WebElement cartButtonLink;
	@FindBy(how = How.ID, using = "signin2")
	public WebElement signUpLink;
	@FindBy(how = How.XPATH, using = "//a[text()='CATEGORIES']")
	public WebElement categoriesText;
	
	
	
	

}
