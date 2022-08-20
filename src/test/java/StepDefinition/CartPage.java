package StepDefinition;



import com.demoBlazeTest.PageAction.CartPageActions;

import com.demoBlazeTest.Utility.Base_Parent;

import cucumber.api.java.en.Then;

public class CartPage extends Base_Parent{

	CartPageActions cartPageActions = new CartPageActions();
	
	@Then("^Verify Pic Lable is displayed in Cart Page$")
	public void verify_Pic_Lable_is_displayed_in_Cart_Page() throws Throwable {
		cartPageActions.verifyPicLableIsDisplayedInCartPage();
	}

	@Then("^Verify Title Lable is displayed in Cart Page$")
	public void verify_Title_Lable_is_displayed_in_Cart_Page() throws Throwable {
		cartPageActions.verifyTitleLableIsDisplayedInCartPage();
	}

	@Then("^Verify Price Lable is displayed in Cart Page$")
	public void verify_Price_Lable_is_displayed_in_Cart_Page() throws Throwable {
		cartPageActions.verifyPicLableIsDisplayedInCartPage();
	}

	@Then("^Verify Place Order button is displayed in Cart Page$")
	public void verify_Place_Order_button_is_displayed_in_Cart_Page() throws Throwable {
		cartPageActions.verifyPlaceOrderButtonIsDisplayedInCartPage();
	}

	@Then("^Verify About us Label is displayed in Cart Page$")
	public void verify_About_us_Label_is_displayed_in_Cart_Page() throws Throwable {
		cartPageActions.verifyAboutusLabelIsDisplayedInCartPage();
	}

	@Then("^Verify Get in Touch Label is displayed in Cart Page$")
	public void verify_Get_in_Touch_Label_is_displayed_in_Cart_Page() throws Throwable {
		cartPageActions.verifyGetInTouchLabelIsDisplayedInCartPage();
	}
	
}
