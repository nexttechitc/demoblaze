package com.demoBlazeTest.PageAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageLocator.ProfilePageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

public class ProfilePageActions extends Base_Parent{

	ProfilePageLocators profilePageLocators = new ProfilePageLocators(); 
	
	public void verifyUserLoginSuccessfully() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(profilePageLocators.ProfiePage));

		boolean profile = profilePageLocators.ProfiePage.isDisplayed();
		Assert.assertTrue(profile);
		
	}
}
