package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class ProfilePageLocators extends Base_Parent{

	public ProfilePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[text()='Welcome testuser92']")
	public WebElement ProfiePage;
}
