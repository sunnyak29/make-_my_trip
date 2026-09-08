package com.makemytrip.automation.pageobjects;

import org.testng.Assert;

import com.makemytrip.automation.base.Base;

public class SearchCabs extends Base {

public void Cab() {
	Click("cabicon");
}

public void setFrom() {
	Click("from");
	Send("fromtext", "Delhi");
	Click("Delhi");
}
public void setTo() {
	Click("to");
	Send("totext", "Manali");
	Click("Manali");
	
}
public void verifysortBy() {
	String actual=GetString("sortby");
	 Assert.assertEquals(actual, "(Lowest to Highest)");
}
}
