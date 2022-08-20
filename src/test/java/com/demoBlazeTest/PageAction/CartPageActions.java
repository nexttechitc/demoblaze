package com.demoBlazeTest.PageAction;

import org.testng.Assert;

import com.demoBlazeTest.PageLocator.CartPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Then;

public class CartPageActions extends Base_Parent{
	
	CartPageLocators cartPageLocators = new CartPageLocators();
	
	public void verifyPicLableIsDisplayedInCartPage() {
		   boolean PicLabelDisplayed = cartPageLocators.picLabel.isDisplayed();
		   Assert.assertTrue(PicLabelDisplayed);
		}
	
	public void verifyTitleLableIsDisplayedInCartPage() {
		boolean titleLabelDisplayed = cartPageLocators.titleLabel.isDisplayed();
		   Assert.assertTrue(titleLabelDisplayed);
	}
	
	public void verifyPriceLableIsDisplayedInCartPage() {
		boolean titleLabelDisplayed = cartPageLocators.titleLabel.isDisplayed();
		   Assert.assertTrue(titleLabelDisplayed);
	}
	
	public void verifyPlaceOrderButtonIsDisplayedInCartPage() throws Throwable {
		boolean placeOrderButtonDisplayed = cartPageLocators.placeOrderButton.isDisplayed();
		   Assert.assertTrue(placeOrderButtonDisplayed);
	}

	public void verifyAboutusLabelIsDisplayedInCartPage() {
		boolean aboutUsDisplayed = cartPageLocators.aboutUsLabel.isDisplayed();
		   Assert.assertTrue(aboutUsDisplayed);
	}
	
	public void verifyGetInTouchLabelIsDisplayedInCartPage() {
		boolean getInTouchDisplayed = cartPageLocators.getInTouchLabel.isDisplayed();
		   Assert.assertTrue(getInTouchDisplayed);
	}
}
