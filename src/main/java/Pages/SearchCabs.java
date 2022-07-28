package Pages;

import org.testng.Assert;

import Base.Base;

public class SearchCabs extends Base {
	
//public void SkipLogin() {
//	if (displayed("loginpg")) {
//		Click("skiplogin");
//	}
//	
//}

public void Cab() {
	Click("cabicon");
}

public void setFrom() {
	Click("from");
    AddWaite(2);
	Send("fromtext", "Delhi");
	AddWaite(3);
	Click("Delhi");
}
public void setTo() {
	Click("to");
	AddWaite(2);
	Send("totext", "Manali");
	AddWaite(3);
	Click("Manali");
	
}
public void verifysortBy() {
	
    AddWaite(10);
	String actual=GetString("sortby");
	 Assert.assertEquals(actual, "(Lowest to Highest)");
}
}
