package com.makemytrip.automation.pageobjects;

import com.makemytrip.automation.base.Base;

public class Hotels extends Base {
public void capturedetails() {
	takeScreenShot();
	System.out.println("total no of adult option available are");
	System.out.println(GetString("noofadults"));
}
}
