package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class LoginPageLocators extends Base_Parent{

	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "loginusername")
	public WebElement userName;
	@FindBy(how = How.ID, using = "loginpassword")
	public WebElement password;
	@FindBy(how = How.XPATH, using = "//button[text() = 'Log in']")
	public WebElement loginButton;
}
