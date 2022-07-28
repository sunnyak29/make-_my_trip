package StepDefination;

import Pages.GiftCards;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardSteps extends GiftCards {
//	@Given("MakeMyTrip landing page")
//	public void make_my_trip_landing_page() {
//	Click("MMTlogo");
//	}


	@Then("Click on Gift Cards icon")
	public void click_on_gift_cards_icon() {
	 giftcards();
	}
	@When("WebPage Title is Gift Cards - Buy Gift Vouchers Online, Gift Vouchers | MakeMyTrip.com")
	public void web_page_title_is_gift_cards_buy_gift_vouchers_online_gift_vouchers_make_my_trip_com() {
	     verifytitle();
		}
	@Then("Click on Wedding Gift Card option")
	public void click_on_wedding_gift_card_option() {
		Click("wedcard");
	}
	@Then("Select E-Mail in Send Via option")
	public void select_e_mail_in_send_via_option() {
		AddWaite(5);
		Click("email");
	}
	@Then("Fill Recipients and sender details while providing wrong email id")
	public void fill_recipients_and_sender_details_while_providing_wrong_email_id() {
		invaliddetails();
	}
	@Then("Click on BUY NOW button")
	public void click_on_buy_now_button() {
		Click("bynow");;
	}
	@Then("Capture the error message")
	public void capture_the_error_message() {
		capture();
	}

	@Given("User is on Gift Cards home section")
	public void user_is_on_gift_cards_home_section() {
	    driver.navigate().back();
	}
	@Then("Fill Recipients and sender details")
	public void fill_recipients_and_sender_details() {
		validdetails();
	}
	@Then("Verify Payment page displayed text You are viewing this booking at the best price")
	public void verify_payment_page_displayed_text_you_are_viewing_this_booking_at_the_best_price() {
		verifypaymentpage();
	}




}
