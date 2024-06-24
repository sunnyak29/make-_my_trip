package com.makemytrip.automation.pageobjects;

import com.makemytrip.automation.base.base;

public class Hotels extends base {
public void capturedetails() {
	takeScreenShot();
	System.out.println("total no of adult option available are");
	System.out.println(GetString("noofadults"));
}
}
