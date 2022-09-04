package com.NeoStox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NeoStox.Base.TestBase;

public class LoginPage extends TestBase {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="txt_mobilenumber")
	private WebElement textboxMobileNumber;
	
	@FindBy(xpath ="//a[@id='lnk_submitmobnumber']")
	private WebElement buttonSubmit;
	
	@FindBy(xpath ="//input[@id='txt_accesspin']")
	private WebElement textboxPin;
	
	@FindBy(id="lnk_submitaccesspin")
	private WebElement buttonSubmitPin;
	
	
	public void entersdata_In_MobileNumber() throws InterruptedException {
		Thread.sleep(2000);
		textboxMobileNumber.sendKeys("9604154175");
	}
	
	public void clickSubmit() {
		buttonSubmit.click();
	}
	
	public void entersdata_In_Pin() throws InterruptedException {
		Thread.sleep(2000);
		textboxPin.sendKeys("2812");
	}
	
	public void clickSubmitPin() {
		buttonSubmitPin.click();
	}
	
}
