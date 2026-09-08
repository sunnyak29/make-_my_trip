package com.makemytrip.automation.pageobjects;

import com.makemytrip.automation.base.Base;

public class Hotels extends Base {
public void capturedetails() {
	takeScreenShot();
	org.testng.Assert.assertFalse(GetString("noofadults").isBlank(), "Adult options should be displayed");
}
}
