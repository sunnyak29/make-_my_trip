package com.makemytrip.automation.stepdefination;

import com.makemytrip.automation.pageobjects.Hotels;

import io.cucumber.java.en.Then;

public class HotelsSteps extends Hotels {
//	@Given("MakeMyTrip HomePage")
//	public void make_my_trip_home_page() {
//  System.out.println();	    
//	}

	@Then("Click on Hotels icon")
	public void click_on_hotels_icon() {
	    Click("hotelicon");
	}
	@Then("click on ROOMS & GUESTS option")
	public void click_on_rooms_guests_option() {
		  Click("roomsandguest");
	}
	@Then("Get the details available")
	public void get_the_details_available() {
		 capturedetails();
	}
 


}
