package com.Facebook.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook.BaseClassFunctions.BaseClass;

public class NewAccountLocators {
		
	public NewAccountLocators() {
		PageFactory.initElements(BaseClass.driver, this);
		}
		
		@FindBy (xpath = "//a[text() = 'Create new account']")
		private WebElement newaccount;
		
		@FindBy (xpath = "//input[@placeholder='First name']")
		private WebElement fname;
		
		@FindBy (xpath = "//input[@ aria-label='Surname']")
		private WebElement sname;
		
		@FindBy (xpath = "//input[contains(@aria-label,'Mobile')]")
		private WebElement mn;
		
		@FindBy (xpath = "//input[@aria-label='New password']")
		private WebElement pass;
		
		@FindBy (xpath = "//select[@aria-label='Day']")
		private WebElement dtdropdown;
		
		@FindBy (xpath = "//select[@aria-label='Month']")
		private WebElement mntdropdown;
		
		@FindBy (xpath = "//select[@aria-label='Year']")
		private WebElement yrdropdown;
		
		@FindBy (xpath = "//button[@name='websubmit']")
		private WebElement signup;

		public WebElement getNewaccount() {
			return newaccount;
		}

		public WebElement getFname() {
			return fname;
		}

		public WebElement getSname() {
			return sname;
		}

		public WebElement getMn() {
			return mn;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getDtdropdown() {
			return dtdropdown;
		}

		public WebElement getMntdropdown() {
			return mntdropdown;
		}

		public WebElement getYrdropdown() {
			return yrdropdown;
		}

		public WebElement getSignup() {
			return signup;
		}

	}
