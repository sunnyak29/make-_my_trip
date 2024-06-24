package com.makemytrip.automation.stepdefination;


import com.makemytrip.automation.pageobjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends HomePage {
	@Given("User is on  MakeMyTrip HomePage")
	public void user_is_on_make_my_trip_home_page() {
	   getURL();
//	   AddWaite(10);
	}
	@Then("verify user is on MakeMyTrip HomePage")
	public void verify_user_is_on_make_my_trip_home_page() {
		getTitle();
	}


}
