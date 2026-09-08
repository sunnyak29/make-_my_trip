package com.makemytrip.automation.pageobjects;

import java.util.ArrayList;
import org.testng.Assert;

import com.makemytrip.automation.base.Base;

public class GiftCards extends Base {
	public void giftcards() {
	    Click("Giftcards");

	}
public void verifytitle() {
	 // store window ids in array list
    ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
    //switch to active tab
    driver.switchTo().window(wid.get(1));
	String actual= driver.getTitle();
	 Assert.assertEquals(actual, "Gift Cards - Buy Gift Vouchers Online, Gift Vouchers | MakeMyTrip.com");
}
public void invaliddetails() {
	Send("recivername","Ritesh");
	Send("recivermob","5645158500");
	Send("reciveremail","mrritesh885.com");
	Send("sendername","Sunny");
	Send("sendermob","8665586420");
	Send("senderemail","sunnyccd001@gmail");
}
public void capture() {
	takeScreenShot();
}
public void validdetails() {
	Send("recivername","Ritesh");
	Send("recivermob","5645158500");
	Send("reciveremail","mrritesh885@hotmail.com");
	Send("sendername","Sunny");
	Send("sendermob","8665586420");
	Send("senderemail","sunnyccd001@gmail.com");
}
public void verifypaymentpage() {
	String actual= GetString("pgtitle");
	 Assert.assertTrue(actual.contains("viewing this booking at the best price"));
}
}

