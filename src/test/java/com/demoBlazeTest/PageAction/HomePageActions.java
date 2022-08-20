package com.demoBlazeTest.PageAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageLocator.AboutUsPageLocators;
import com.demoBlazeTest.PageLocator.CartPageLocators;
import com.demoBlazeTest.PageLocator.ContactPageLocators;
import com.demoBlazeTest.PageLocator.HomePageLocators;
import com.demoBlazeTest.PageLocator.LoginPageLocators;
import com.demoBlazeTest.PageLocator.SignUpPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;


public class HomePageActions extends Base_Parent {

	HomePageLocators homePageLocators = new HomePageLocators();
	ContactPageLocators contactPageLocators = new ContactPageLocators();
	AboutUsPageLocators aboutUsPageLocators = new AboutUsPageLocators();
	CartPageLocators cartPageLocators = new CartPageLocators();
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	SignUpPageLocators signUpPageLocators = new SignUpPageLocators();

	public LoginPageLocators clickLoginButton() throws InterruptedException {
		homePageLocators.signInLink.click();
		return new LoginPageLocators();
	}

	public void verifyHomeLinkIsDisplayed() {
		boolean homeButtonDisplayed = homePageLocators.homeButtonLink.isDisplayed();
		Assert.assertTrue(homeButtonDisplayed);
	}
	
	public void verifyHomeLinkIsEnabled() {
		boolean categoryLinkDisplayed = homePageLocators.categoriesText.isDisplayed();
		Assert.assertTrue(categoryLinkDisplayed);
	}
	
	public void verifyContactLinkIsDisplayed() {
		boolean contactButtonDisplayed = homePageLocators.contactButtonLink.isDisplayed();
		Assert.assertTrue(contactButtonDisplayed);
	}
	
	public void verifyContactLinkIsEnabled() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(contactPageLocators.sendMessageButton));
		boolean sendUsButtonEnabled = contactPageLocators.sendMessageButton.isDisplayed();
		Assert.assertTrue(sendUsButtonEnabled);
	}
	
	public ContactPageLocators clickContactButton() {
		homePageLocators.contactButtonLink.click();
		return new ContactPageLocators();
	}
	
	public void verifyAboutusLinkIsDisplayed() {
		boolean aboutUsButtonDisplayed = homePageLocators.aboutUsButtonLink.isDisplayed();
		Assert.assertTrue(aboutUsButtonDisplayed);
	}
	
	public void verifyAboutusLinkIsEnabled() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(aboutUsPageLocators.playButton));
		boolean playButtonButtonDisplayed = aboutUsPageLocators.playButton.isDisplayed();
		Assert.assertTrue(playButtonButtonDisplayed);
		boolean playButtonButtonEnabled = aboutUsPageLocators.playButton.isEnabled();
		Assert.assertTrue(playButtonButtonEnabled);
	}
	
	public void verifyAboutusTextIsDisplayed() {
	    boolean aboutUsTextDisplayed = aboutUsPageLocators.aboutUsText.isDisplayed();
	    Assert.assertTrue(aboutUsTextDisplayed);
	}

	public AboutUsPageLocators clickAboutUsButton() {
		homePageLocators.aboutUsButtonLink.click();
		return new AboutUsPageLocators();
	}

	public CartPageLocators clickCartButton() {
		homePageLocators.cartButtonLink.click();
		return new CartPageLocators();
	}
	
	public void verifyCartLinkIsDisplayed() {
		boolean cartButtonDisplayed = homePageLocators.cartButtonLink.isDisplayed();
		Assert.assertTrue(cartButtonDisplayed);
	}
	
	public void verifyCartLinkIsEnabled() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(cartPageLocators.placeOrderButton));
		boolean placeOrderButtonDisplayed = cartPageLocators.placeOrderButton.isDisplayed();
		Assert.assertTrue(placeOrderButtonDisplayed);
	}
	
	public void verifyLoginLinkIsDisplayed() {
		boolean loginButtonDisplayed = homePageLocators.signInLink.isDisplayed();
		Assert.assertTrue(loginButtonDisplayed);
	}
	
	public void verifyLoginLinkIsEnabled() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(loginPageLocators.loginButton));
		boolean loginButtonDisplayed = loginPageLocators.loginButton.isDisplayed();
		Assert.assertTrue(loginButtonDisplayed);
	}
	
	public void verifySignupLinkIsDisplayed() {
		boolean signUpButtonDisplayed = homePageLocators.signUpLink.isDisplayed();
		Assert.assertTrue(signUpButtonDisplayed);
	}
	
	public void verifySignupLinkIsEnabled() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(signUpPageLocators.signUpButton));
		boolean signUpButtonDisplayed = signUpPageLocators.signUpButton.isDisplayed();
		Assert.assertTrue(signUpButtonDisplayed);
		boolean signUpButtonClickable = signUpPageLocators.signUpButton.isEnabled();
		Assert.assertTrue(signUpButtonClickable);
	}

	public SignUpPageLocators clickSignUpButton() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(homePageLocators.signUpLink));
		homePageLocators.signUpLink.click();
		return new SignUpPageLocators();
	}
}
