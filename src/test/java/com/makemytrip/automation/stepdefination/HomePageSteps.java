package com.makemytrip.automation.stepdefination;


import com.makemytrip.automation.pageobjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends HomePage {
	@Given("User is on MakeMyTrip HomePage")
	public void user_is_on_make_my_trip_home_page() {
		getURL();
	}
	@Then("Skip login and Create Account")
	public void skip_login_and_create_account() {
		skipLoginIfPresent();
	}
	@Then("verify user is on MakeMyTrip HomePage")
	public void verify_user_is_on_make_my_trip_home_page() {
		getTitle();
	}


}
