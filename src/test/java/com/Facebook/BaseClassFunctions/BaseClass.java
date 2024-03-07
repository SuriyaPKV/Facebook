package com.Facebook.BaseClassFunctions;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
public static BaseClass base = null;
	
	private BaseClass() {}
	
	public static BaseClass getInstance() {
		if(base==(null));
		base = new BaseClass();
		return base;
	}
	
	public static WebDriver driver;
	public static Actions action;
	public static Select select;
	public static Alert alert;
	public static JavascriptExecutor js;
	public static File targetfile;
	 
	
	public static void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void gotoUrl(String url) {
		driver.get(url);
	}
	public static void browserClose() {
		driver.quit();
	}
	public String titleName(WebElement Ele) {
		String title = driver.getTitle();
		return title;
	}
	public String currentUrl(WebElement Ele) {
		String Url = driver.getCurrentUrl();
		return Url;
	}
	public void btnClick(WebElement Ele) {
		Ele.click();
	}
	public void inputText(WebElement Ele, String value) {
		Ele.sendKeys(value);
	}
	public String retrieweText(WebElement Ele) {
		String text = Ele.getText();
		return text;
	}
	public String attribute(WebElement Ele, String value) {
		String attribute = Ele.getAttribute(value);
		return attribute;
	}
	public boolean displayed(WebElement Ele) {
		boolean displayed = Ele.isDisplayed();
		return displayed;
	}
	public boolean enabled(WebElement Ele) {
		boolean enabled = Ele.isEnabled();
		return enabled;
	}
	public boolean visibilityOfElement(WebElement Ele) {
		boolean selected = Ele.isSelected();
		return selected;
	}
	//Actions
	public void singleClick(WebElement Ele) {
		action.click(Ele).build().perform();
	}
	public void inputText(String value, WebElement Ele) {
		action.sendKeys(Ele, value).build().perform();
	}
	public void twoClick(WebElement Ele) {
		action.doubleClick(Ele).build().perform();
	}
	public void gotoElement(WebElement Ele) {
		action.moveToElement(Ele).build().perform();
	}
	public void rightClick(WebElement Ele) {
		action.contextClick(Ele).build().perform();
	}
	public void moveOneElementToAnother(WebElement Ele) {
		action.moveToElement(Ele).build().perform();
	}
	//Select
	
	public void selectIndex(WebElement dropdown, int i) {
		select = new Select(dropdown);
		select.selectByIndex(i);
	}
	public void selectValue(WebElement dropdown, String value) {
		select = new Select(dropdown);
		select.selectByValue(value);
	}
	public void selectVisibleText(WebElement dropdown, String visibleText) {
		select = new Select(dropdown);
		select.selectByVisibleText(visibleText);
	}
	public void allDeselect(WebElement dropdown) {
		select = new Select(dropdown);
		select.deselectAll();
   }
	public List<WebElement> selectOptions(WebElement dropdown) {
		select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		return options;	
	}
	public List<WebElement> retriewAllSelectedOptions(WebElement dropdown) {
		select = new Select(dropdown);
		List<WebElement> options = select.getAllSelectedOptions();
		return options;
	}
	public WebElement retriewFirstSelectedOptions(WebElement dropdown) {
		select = new Select(dropdown);
		WebElement options = select.getFirstSelectedOption();
		return options;
	}
	//Alert
	
	public Alert popup() {
		alert = driver.switchTo().alert();
		return alert;
	}
	
	public void popupInsertText(String value) {
		alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
	
	public void dismisspopup() {
		alert.dismiss();
	}
	
	public void acceptpopup() {
		alert.accept();
	}
	//Frame
	
	public void defaultFrame() {
		driver.switchTo().defaultContent();
	}
	public void previousFrame() {
		driver.switchTo().parentFrame();
	}
	public void nextFrame(WebElement Ele) {
		driver.switchTo().frame(Ele);
	}
	
	//Navigate
	
	public void pageForward() {
		driver.navigate().forward();
	}
	public void pageBackward() {
		driver.navigate().back();
	}
	public void pageRefresh() {
		driver.navigate().refresh();
	}
	
	//WindowHandle
	
	public String handleWindow() {
		String handleWindow = driver.getWindowHandle();
		return handleWindow;
	}
	public Set<String> handleWindows() {
		Set<String> handleWindows = driver.getWindowHandles();
		return handleWindows;
	}
	
	//waits
	
	public void iwaits( ) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	//javascriptExecutor
	
	public void Scrolldown(WebElement Ele) {
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", Ele);
	}
	public void ScrollUp(WebElement Ele) {
		js.executeAsyncScript("arguments[0].scrollIntoView(false)", Ele);
	}
	public void jsInputText(WebElement Ele, String value) {
		js.executeAsyncScript("arguments[0].setAttribute('value',"+value+"')",Ele);
	}
	public void jsClick(WebElement Ele) {
		js.executeAsyncScript("arguments[0].click",Ele);
	}
	
	//screenshot
	
	public void Screenshots(String value) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		targetfile  = new File("C:\\Users\\user\\eclipse-workspace\\Facebook_Cucumber\\target\\"+value+".png");
			try {
				FileUtils.copyFile(src, targetfile);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
