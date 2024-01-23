package StepDefination;

import Pages.SearchCabs;
import io.cucumber.java.en.Then;

public class SearchCabsSteps extends SearchCabs {
//	@Then("Skip login and Create Account")
//	public void skip_login_and_create_account() {
//		 SkipLogin();
//	}
	@Then("Click on Cabs icon")
	public void click_on_cabs_icon() {
		 Cab();
	}
	@Then("User set  Delhi and Manali in from and To text box options")
	public void user_set_delhi_and_manali_in_from_and_to_text_box_options() {
		 setFrom();
		 setTo();
	}
	@Then("User Click on search icon")
	public void user_click_on_search_icon() {
		 Click("searchbutton");
	}
	@Then("Verify Sorted By option is Price Lowest To Highest")
	public void verify_sorted_by_option_is_price_lowest_to_highest() {
		verifysortBy();
	}
	@Then("User select suv form Cab Type")
	public void user_select_suv_form_cab_type() {
		 Click("suv");
	}
	@Then("Get the lowest charges")
	public void get_the_lowest_charges() {
	 System.out.println(GetString("lprice"));
	}

	@Then("Closedriver")
	public void closedriver() {
	   closeBrowser();
	}

}
