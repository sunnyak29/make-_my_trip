package com.makemytrip.automation.hooks;

import com.makemytrip.automation.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void startBrowser() {
		new Base().invokeBrowser();
	}

	@After
	public void closeBrowser(Scenario scenario) {
		if (scenario.isFailed() && Base.driver != null) {
			new Base().takeScreenShot();
		}
		new Base().closeBrowser();
	}
}