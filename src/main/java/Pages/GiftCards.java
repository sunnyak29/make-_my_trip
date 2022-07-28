package Pages;

import java.util.ArrayList;
import org.testng.Assert;

import Base.Base;

public class GiftCards extends Base {
	public void giftcards() {
//		if (displayed("loginpg")) {
//	}
		AddWaite(5);
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
	AddWaite(2);
	Send("recivername","Ritesh");
	Send("recivermob","5645158500");
	Send("reciveremail","mrritesh885.com");
	Send("sendername","Sunny");
	Send("sendermob","8665586420");
	Send("senderemail","sunnyccd001@gmail");
}
public void capture() {
	takeScreenShot();
	System.out.println("error captured");
}
public void validdetails() {
	AddWaite(2);
	Send("recivername","Ritesh");
	Send("recivermob","5645158500");
	Send("reciveremail","mrritesh885@hotmail.com");
	Send("sendername","Sunny");
	Send("sendermob","8665586420");
	Send("senderemail","sunnyccd001@gmail.com");
}
public void verifypaymentpage() {
	AddWaite(10);
	String actual= GetString("pgtitle");
//	 Assert.asserte(actual, "Hey,Yuo are viewing this booking at the best price");
	 Assert.assertTrue(actual.contains("viewing this booking at the best price"));
}
}

