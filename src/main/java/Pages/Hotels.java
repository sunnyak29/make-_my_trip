package Pages;

import Base.Base;

public class Hotels extends Base {
public void capturedetails() {
	takeScreenShot();
	System.out.println("total no of adult option available are");
	System.out.println(GetString("noofadults"));
}
}
