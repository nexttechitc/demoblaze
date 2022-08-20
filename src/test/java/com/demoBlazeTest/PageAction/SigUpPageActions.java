package com.demoBlazeTest.PageAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageLocator.SignUpPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;
import com.demoBlazeTest.Utility.TestData;

public class SigUpPageActions extends Base_Parent {
	
	SignUpPageLocators signUpPageLocators = new SignUpPageLocators();
	/*
	 * public void userCredentials(String username, String password) {
	 * signUpPageLocators.userName.sendKeys(username);
	 * signUpPageLocators.password.sendKeys(password);
	 * signUpPageLocators.signUpButton.click(); }
	 */
	
	public void typeUsernameAndPasswordAndClickSignupButton() throws Exception {
		signUpPageLocators.signUpUserName.sendKeys(TestData.UserNameRegistration1);
		Thread.sleep(5000);
		signUpPageLocators.signUpPassword.sendKeys(TestData.PasswordRegistration1);
		signUpPageLocators.signUpButton.click();
	}
	
	public void VerifyUsernameTextBoxIsDisplayedInSignupPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(signUpPageLocators.signUpUserName));
		boolean userNameDisplayed = signUpPageLocators.signUpUserName.isDisplayed();
		Assert.assertTrue(userNameDisplayed);
	}
	
	public void verifyPasswordTextBoxIsDisplayedInSignupPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(signUpPageLocators.signUpPassword));
		boolean passwordDisplayed = signUpPageLocators.signUpPassword.isDisplayed();
		Assert.assertTrue(passwordDisplayed);
	}

	
	public void verifyAlertMessage() throws Exception {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		Assert.assertEquals(alertMessage, "Sign up successful.");
	}
}
