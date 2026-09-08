package com.makemytrip.automation.pageobjects;


import org.testng.Assert;

import com.makemytrip.automation.base.Base;

public class HomePage extends Base {
	// To get URL
	public void getURL() {
		openURL();
	}
	public void skipLoginIfPresent() {
		clickIfPresent("skiplogin");
	}
	public void getTitle() {
		Assert.assertTrue(driver.getCurrentUrl().contains("makemytrip.com"), "The browser should be on the MakeMyTrip domain");
		Assert.assertFalse(driver.getTitle().isBlank(), "The MakeMyTrip homepage title should not be blank");
	}
}
