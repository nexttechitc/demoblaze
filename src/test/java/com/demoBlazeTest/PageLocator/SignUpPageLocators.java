package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class SignUpPageLocators extends Base_Parent{

	public SignUpPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Sign up']")
	public WebElement signUpButton;
	@FindBy(how = How.ID, using = "sign-username")
	public WebElement signUpUserName;
	@FindBy(how = How.XPATH, using = "//input[@id='sign-password']")
	public WebElement signUpPassword;
	
}
