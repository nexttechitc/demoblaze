package StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageAction.HomePageActions;
import com.demoBlazeTest.PageAction.LoginPageActions;
import com.demoBlazeTest.PageAction.ProfilePageActions;
import com.demoBlazeTest.PageLocator.LoginPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Logins extends Base_Parent{
	
	HomePageActions homePageActions = new HomePageActions();
	LoginPageActions loginPageActions = new LoginPageActions();
	ProfilePageActions profilePageActions = new ProfilePageActions();
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	
	@Given("^Launch Application$")
	public void launch_Application() throws Throwable {
		URLLaunch();
	}

	@Then("^Click Login Link$")
	public LoginPageLocators click_Login_Link() throws Throwable {
		homePageActions.clickLoginButton();
		return new LoginPageLocators();
	}
	
	@Then("^Verify Username textBox is displayed$")
	public void verify_Username_textBox_is_displayed() throws Throwable {
		loginPageActions.verifyUsernameTextBoxIsDisplayed();
	}
	
	@Then("^Verify Password textBox is displayed$")
	public void verify_Password_textBox_is_displayed() throws Throwable {
		loginPageActions.verifyPasswordTextBoxIsDisplayed();
	}
	
	@Then("^Verify Login button is enabled$")
	public void verify_Login_button_is_enabled() throws Throwable {
		loginPageActions.verifyLoginButtonIsEnabled();
	}

	@Then("^Type username and password and click signin$")
	public void type_username_and_password_and_click_signin() throws Throwable {
		loginPageActions.userCredentials(prop.getProperty("UserName1"), prop.getProperty("Password1"));
	}

	/*@Then("^Click Login Button$")
	*
	 * public void click_Login_Button() throws Throwable { loginPageActions.c
	 * 
	 * }
	 */

	@Then("^Verify User login successfully$")
	public void verify_User_login_successfully() throws Throwable {
		profilePageActions.verifyUserLoginSuccessfully();
	}
}
