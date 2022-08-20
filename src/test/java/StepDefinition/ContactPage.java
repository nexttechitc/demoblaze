package StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageAction.ContactPageActions;
import com.demoBlazeTest.PageLocator.ContactPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Then;

public class ContactPage extends Base_Parent{
	
	ContactPageActions contactPageActions = new ContactPageActions();
	
	@Then("^Verify Contact Email textBox is displayed in Contact Page$")
	public void verify_Contact_Email_textBox_is_displayed_in_Contact_Page() throws Throwable {
		contactPageActions.verifyContactEmailTextBoxIsDisplayedInContactPage();
	}
	
	@Then("^Verify Contact Name textBox is displayed in Contact Page$")
	public void verify_Contact_Name_textBox_is_displayed_in_Contact_Page() throws Throwable {
		contactPageActions.verifyContactNameTextBoxIsDisplayedInContactPage();
	}
	
	@Then("^Verify message textBox is displayed in Contact Page$")
	public void verify_message_textBox_is_displayed_in_Contact_Page() throws Throwable {
		contactPageActions.verifyMessageTextBoxIsDisplayedInContactPage();
	}
	
	@Then("^Enter Contact Name Contact Email Message and click Send Message button in Contact Page$")
	public void enter_Contact_Name_Contact_Email_Message_and_click_Send_Message_button_in_Contact_Page() throws Throwable {
		contactPageActions.EnterContactNameContactEmailMessageAndClickSendMessageButtonInContactPage();
	}

	@Then("^Verify Send Message button is working fine in Contact Page$")
	public void verify_Send_Message_button_is_working_fine_in_Contact_Page() throws Throwable {
		contactPageActions.verifyAlertMessage();
	}



}
