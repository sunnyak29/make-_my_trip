package com.makemytrip.automation.pageobjects;


import org.testng.Assert;

import com.makemytrip.automation.base.Base;

public class HomePage extends Base {
	// To get URL
	public void getURL() {
        invokeBrowser();
		openURL();
//		AddWaite(10);
	}
	public void getTitle() {
		Assert.assertEquals(driver.getTitle(),"MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");
	}
}
