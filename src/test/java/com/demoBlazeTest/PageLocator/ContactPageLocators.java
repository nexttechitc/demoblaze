package com.demoBlazeTest.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.demoBlazeTest.Utility.Base_Parent;

public class ContactPageLocators extends Base_Parent{

	public ContactPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[text()='Send message']")
	public WebElement sendMessageButton;
	@FindBy(how = How.ID, using = "recipient-email")
	public WebElement contactEmailTextBox;
	@FindBy(how = How.ID, using = "recipient-name")
	public WebElement contactNameTextBox;
	@FindBy(how = How.ID, using = "message-text")
	public WebElement messageTextBox;
	
}
