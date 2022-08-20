package StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageAction.HomePageActions;
import com.demoBlazeTest.PageLocator.AboutUsPageLocators;
import com.demoBlazeTest.PageLocator.CartPageLocators;
import com.demoBlazeTest.PageLocator.ContactPageLocators;
import com.demoBlazeTest.PageLocator.HomePageLocators;
import com.demoBlazeTest.PageLocator.LoginPageLocators;
import com.demoBlazeTest.PageLocator.SignUpPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Then;

public class HomePage extends Base_Parent {

	HomePageLocators homePageLocators = new HomePageLocators();
	ContactPageLocators contactPageLocators = new ContactPageLocators();
	CartPageLocators cartPageLocators = new CartPageLocators();
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	SignUpPageLocators signUpPageLocators = new SignUpPageLocators();
	HomePageActions homePageActions = new HomePageActions();
	AboutUsPageLocators aboutUsPageLocators = new AboutUsPageLocators();

	@Then("^Click Home Link$")
	public void click_Home_Link() throws Throwable {
		loginPageLocators = homePageActions.clickLoginButton();
	}

	@Then("^Verify Home Link is displayed$")
	public void verify_Home_Link_is_displayed() throws Throwable {
		homePageActions.verifyHomeLinkIsDisplayed();
	}

	@Then("^Verify Home Link is enabled$")
	public void verify_Home_Link_is_enabled() throws Throwable {
		homePageActions.verifyHomeLinkIsEnabled();
	}

	@Then("^Click Contact Link$")
	public void click_Contact_Link() throws Throwable {
		contactPageLocators = homePageActions.clickContactButton();
	}

	@Then("^Verify Contact Link is displayed$")
	public void verify_Contact_Link_is_displayed() throws Throwable {
		homePageActions.verifyContactLinkIsDisplayed();

	}

	@Then("^Click About us Link$")
	public void click_About_us_Link() throws Throwable {
		aboutUsPageLocators = homePageActions.clickAboutUsButton();
	}

	@Then("^Verify Contact Link is enabled$")
	public void verify_Contact_Link_is_enabled() throws Throwable {
		homePageActions.verifyContactLinkIsEnabled();
	}

	@Then("^Verify About us Link is displayed$")
	public void verify_About_us_Link_is_displayed() throws Throwable {
		homePageActions.verifyAboutusLinkIsDisplayed();
	}

	@Then("^Verify About us Link is enabled$")
	public void verify_About_us_Link_is_enabled() throws Throwable {
		homePageActions.verifyAboutusLinkIsEnabled();
	}
	
	@Then("^Verify About us Text is displayed$")
	public void verify_About_us_Text_is_displayed() throws Throwable {
		homePageActions.verifyAboutusTextIsDisplayed();
	}

	@Then("^Click Cart Link$")
	public void click_Cart_Link() throws Throwable {
		cartPageLocators = homePageActions.clickCartButton();
	}

	@Then("^Verify Cart Link is displayed$")
	public void verify_Cart_Link_is_displayed() throws Throwable {
		homePageActions.verifyCartLinkIsDisplayed();
	}

	@Then("^Verify Cart Link is enabled$")
	public void verify_Cart_Link_is_enabled() throws Throwable {
		homePageActions.verifyCartLinkIsEnabled();
	}

	@Then("^Verify Login Link is displayed$")
	public void verify_Login_Link_is_displayed() throws Throwable {
		homePageActions.verifyLoginLinkIsDisplayed();
	}

	/*
	 * @Then("^Click Login Link$") public void Click_Login_Link() throws Throwable {
	 * loginPageLocators = homePageActions.clickLoginButton(); }
	 */

	@Then("^Verify Login Link is enabled$")
	public void verify_Login_Link_is_enabled() throws Throwable {
		homePageActions.verifyLoginLinkIsEnabled();
	}

	@Then("^Verify Sign up Link is displayed$")
	public void verify_Sign_up_Link_is_displayed() throws Throwable {
		homePageActions.verifySignupLinkIsDisplayed();
	}
	
	@Then("^Click Sign up Link$")
	public void Click_Sign_up_Link() throws Throwable {
		signUpPageLocators = homePageActions.clickSignUpButton();
	}

	@Then("^Verify Sign up Link is enabled$")
	public void verify_Sign_up_Link_is_enabled() throws Throwable {
		homePageActions.verifySignupLinkIsEnabled();
	}
}
