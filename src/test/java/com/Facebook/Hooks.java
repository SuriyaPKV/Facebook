package com.Facebook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Facebook.BaseClassFunctions.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void launching(Scenario scenario) {
		BaseClass.browserLaunch();
		BaseClass.gotoUrl("https://www.facebook.com/");
		final byte[] source = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
//		 scenario.embed(source, "image/png");
	}
	
	@After
	public void closing(Scenario scenario) {
		final byte[] source = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
//		 scenario.embed(source, "image/png");
//		 BaseClass.browserClose();
	}

}
