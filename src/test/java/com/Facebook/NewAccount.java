package com.Facebook;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Facebook.BaseClassFunctions.BaseClass;
import com.Facebook.Locators.NewAccountLocators;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewAccount {
	
	public static BaseClass base = BaseClass.getInstance();
	public static NewAccountLocators locators = new NewAccountLocators();
	public static WebDriverWait wait;
	
//	
//	@Given("Launch the facebook website {string}")
//	public void launch_the_facebook_website(String url ) {
//		base.gotoUrl(url);
//	}

	@Given("Click on Create new account")
	public void click_on_create_new_account() throws Throwable {
//		wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(locators.getNewaccount()));
//	    WebElement newaccount = base.driver.findElement(By.xpath("//a[text() = 'Create new account']"));
	    base.btnClick(locators.getNewaccount());
	    
	}

	@When("Enter the name {string}")
	public void enter_the_name(String firstname) {
//		WebElement fname = base.driver.findElement(By.xpath("//input[@placeholder=\'First name\']"));
    	base.inputText(locators.getFname(), firstname);
	}

	@When("Enter the surname {string}")
	public void enter_the_surname(String surname) {
//		WebElement sname = base.driver.findElement(By.xpath("//input[@ aria-label=\'Surname\']"));
    	base.inputText(locators.getSname(), surname);
	}

	@When("Enter the number {string}")
	public void enter_the_number(String mobileNo) {
		//WebElement mn = base.driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile')]"));
    	base.inputText(locators.getMn(), mobileNo);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) {
//		WebElement pass = base.driver.findElement(By.xpath("//input[@aria-label=\"New password\"]"));
    	base.inputText(locators.getPass(), password);
	}

	@When("Select date of birth {string}")
	public void select_date_of_birth(String date) {
//		WebElement dtdropdown = base.driver.findElement(By.xpath("//select[@aria-label=\'Day\']"));
//    	base.selectOptions(locators.getDtdropdown());
    	base.selectVisibleText(locators.getDtdropdown(), date);
    	}
  

	@When("Select date of month {string}")
	public void select_date_of_month(String month) {
//		WebElement mntdropdown = base.driver.findElement(By.xpath("//select[@aria-label='Month']"));
//    	base.selectOptions(locators.getMntdropdown());
    	base.selectVisibleText(locators.getMntdropdown(), month);
	}

	@When("Select date of year {string}")
	public void select_date_of_year(String year) {
//		WebElement yrdropdown = base.driver.findElement(By.xpath("//select[@aria-label='Year']"));
//    	base.selectOptions(locators.getYrdropdown());
    	base.selectVisibleText(locators.getYrdropdown(), year);
	}
	@When("Click on Sign Up")
	public void click_on_sign_up() {
//		WebElement signup = base.driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
    	base.btnClick(locators.getSignup());
    	
	}

	@Then("Take screenshot {string}")
	public void take_screenshot(String firstname) {

		try {
			Thread.sleep(5000);
			base.Screenshots(firstname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Then("Brokenlink {string}")
	public void brokenlink(String bnlink) throws Throwable {
		//base.browserLaunch();
		//driver.get(bnlink);
		//driver.manage().window().maximize();
		List<WebElement> Ele = base.driver.findElements(By.tagName("link"));
		Iterator<WebElement> iterator = Ele.iterator();
		while(iterator.hasNext()) {
			WebElement link = iterator.next();
			String href = link.getAttribute("href");
			
			if((href==null)|| href.isEmpty()) {
				System.out.println("Link not available");
			}
			else if(!href.startsWith("www.facebook.com")) {
			     System.out.println("Links not related to FB:"+href);
		}
			else {
				HttpURLConnection http = (HttpURLConnection) (new URL(href).openConnection());
			   http.setRequestMethod("HEAD");
			   http.connect();
			   int responsecode = http.getResponseCode();
			   if(responsecode ==200) {
				   System.out.println("Link is not broken: "+href);
			   }
			
			}
		}
	}
		
   

}
