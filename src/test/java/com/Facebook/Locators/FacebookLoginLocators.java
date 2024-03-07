package com.Facebook.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.BaseClassFunctions.BaseClass;

public class FacebookLoginLocators {
	
	public FacebookLoginLocators() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement pass; 
	
	@FindBy (xpath = "//button[@name='login']")
	private WebElement button;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getButton() {
		return button;
	}
	
}
