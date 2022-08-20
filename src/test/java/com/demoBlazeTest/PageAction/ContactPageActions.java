package com.demoBlazeTest.PageAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageLocator.ContactPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;
import com.demoBlazeTest.Utility.TestData;

public class ContactPageActions extends Base_Parent{

	ContactPageLocators contactPageLocators = new ContactPageLocators();
	
	public void userCredentials(String email, String name, String message) {
		contactPageLocators.contactEmailTextBox.sendKeys(email);
		contactPageLocators.contactNameTextBox.sendKeys(name);
		contactPageLocators.messageTextBox.sendKeys(message);
		contactPageLocators.sendMessageButton.click();
	}
	
	public void verifyContactEmailTextBoxIsDisplayedInContactPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(contactPageLocators.contactEmailTextBox));
		boolean emailBoxDisplayed = contactPageLocators.contactEmailTextBox.isDisplayed();
		Assert.assertTrue(emailBoxDisplayed);
	}
	
	public void verifyContactNameTextBoxIsDisplayedInContactPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(contactPageLocators.contactNameTextBox));
		boolean nameBoxDisplayed = contactPageLocators.contactNameTextBox.isDisplayed();
		Assert.assertTrue(nameBoxDisplayed);
	}
	
	public void verifyMessageTextBoxIsDisplayedInContactPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(contactPageLocators.messageTextBox));
		boolean messageBoxDisplayed = contactPageLocators.messageTextBox.isDisplayed();
		Assert.assertTrue(messageBoxDisplayed);
	}
	
	public void verifyAlertMessage() throws Exception {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.alertIsPresent());
		 */
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		String alertMessage = alert.getText();
		Assert.assertEquals("Thanks for the message!!", alertMessage);
	}
	
	public void EnterContactNameContactEmailMessageAndClickSendMessageButtonInContactPage() {
		contactPageLocators.contactEmailTextBox.sendKeys(TestData.contactEmail1);
		contactPageLocators.contactNameTextBox.sendKeys(TestData.contactUserName1);
		contactPageLocators.messageTextBox.sendKeys(TestData.contactMessage1);
		contactPageLocators.sendMessageButton.click();
	}
}
