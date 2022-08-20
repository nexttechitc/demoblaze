package com.demoBlazeTest.PageAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageLocator.AboutUsPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

public class AboutUsActions extends Base_Parent {

	AboutUsPageLocators aboutUsPageLocators = new AboutUsPageLocators();

	public void verifyVideoIsDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(aboutUsPageLocators.video));
		boolean videoDisplayed = aboutUsPageLocators.video.isDisplayed();
		Assert.assertTrue(videoDisplayed);
	}
}
