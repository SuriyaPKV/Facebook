package com.Facebook;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Facebook.BaseClassFunctions.BaseClass;
import com.Facebook.Locators.FacebookLoginLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	public static BaseClass base = BaseClass.getInstance();
	public static FacebookLoginLocators locators = new FacebookLoginLocators();
	public static WebDriverWait wait;
	
//	@Given("Launch the facebook website {string}")
//	public void launch_the_facebook_website(String url) {
//		base.gotoUrl(url);
//	}
	
	@When("User enter phone number {string}")
	public void user_enter_phone_number(String MobileNo) throws Throwable {
		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locators.getUsername()));
//		WebElement username = base.driver.findElement(By.xpath("//input[@id='email']"));
    	base.inputText(locators.getUsername(), MobileNo);
    	
    	Thread.sleep(1000);
	}

	@When("User enter password {string}")
	public void user_enter_password(String Password) throws Throwable {
//		WebElement pass = base.driver.findElement(By.xpath("//input[@id='pass']"));
    	base.inputText(locators.getPass(), Password);
    	
    	Thread.sleep(1000);
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
//		WebElement button = base.driver.findElement(By.xpath("//button[@name='login']"));
    	base.btnClick(locators.getButton());
	}
}
