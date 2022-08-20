package StepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demoBlazeTest.PageAction.AboutUsActions;
import com.demoBlazeTest.PageLocator.AboutUsPageLocators;
import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Then;

public class AboutUsPage extends Base_Parent{

	AboutUsActions aboutUsActions = new AboutUsActions();
	
	@Then("^Verify Video is displayed$")
	public void verify_Video_is_displayed() throws Throwable {
		aboutUsActions.verifyVideoIsDisplayed();
	}

}
