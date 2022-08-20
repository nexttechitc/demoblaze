package StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageAction.SigUpPageActions;
import com.demoBlazeTest.PageLocator.SignUpPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Then;

public class SignUpPage extends Base_Parent{
	
	SignUpPageLocators signUpPageLocators = new SignUpPageLocators();
	SigUpPageActions signUpPageActions = new SigUpPageActions();

	@Then("^Verify Username textBox is displayed in Signup Page$")
	public void Verify_Username_textBox_is_displayed_in_Signup_Page() throws Throwable {
		signUpPageActions.VerifyUsernameTextBoxIsDisplayedInSignupPage();
	}
	
	@Then("^Verify Password textBox is displayed in Signup Page$")
	public void verify_Password_textBox_is_displayed_in_Signup_Page() throws Throwable {
		signUpPageActions.verifyPasswordTextBoxIsDisplayedInSignupPage();
	}
	
	@Then("^Type username and password and click signup button$")
	public void type_username_and_password_and_click_signup_button() throws Throwable {
		signUpPageActions.typeUsernameAndPasswordAndClickSignupButton();
		//signUpPageLocators.signUpButton.click();
	}

	@Then("^Verify sign up button is working fine$")
	public void verify_sign_up_button_is_working_fine() throws Throwable {
		signUpPageActions.verifyAlertMessage();
	}
	
	/*
	 * @Then("^Verify Sign up Link is displayed$") public void
	 * Verify_Sign_up_Link_is_displayed() throws Throwable { WebDriverWait wait =
	 * new WebDriverWait(driver, 20);
	 * wait.until(ExpectedConditions.elementToBeClickable(signUpPageLocators.
	 * signUpButton)); boolean signUpButtonDisplayed =
	 * signUpPageLocators.signUpButton.isDisplayed();
	 * Assert.assertTrue(signUpButtonDisplayed); }
	 */
}
