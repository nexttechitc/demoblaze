package com.demoBlazeTest.PageAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageLocator.LoginPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

public class LoginPageActions extends Base_Parent{

	LoginPageLocators loginPageLocators = new LoginPageLocators();
	
	public void userCredentials(String username, String password) throws Exception {
		Thread.sleep(5000);
		loginPageLocators.userName.sendKeys(username);
		Thread.sleep(5000);
		loginPageLocators.password.sendKeys(password);
		Thread.sleep(5000);
		loginPageLocators.loginButton.click();
	}
	
	public void verifyUsernameTextBoxIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(loginPageLocators.userName));
		boolean userNameDisplayed = loginPageLocators.userName.isDisplayed();
		Assert.assertTrue(userNameDisplayed);
	}
	
	public void verifyPasswordTextBoxIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(loginPageLocators.password));
		boolean passwordButtonDisplayed = loginPageLocators.password.isDisplayed();
		Assert.assertTrue(passwordButtonDisplayed);
	}
	
	public void verifyLoginButtonIsEnabled() {
	    boolean loginLinkEnabled = loginPageLocators.loginButton.isEnabled();
	    Assert.assertTrue(loginLinkEnabled);
	}
}
