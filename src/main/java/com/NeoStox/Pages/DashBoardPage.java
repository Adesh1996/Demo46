package com.NeoStox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NeoStox.Base.TestBase;

public class DashBoardPage extends TestBase {
		
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[@id='ctl00_lbl_username']")
	private WebElement headerUsername;
	
	
	public String getTextHeader() throws InterruptedException
	{Thread.sleep(5000);
		String header = headerUsername.getText();
		return header;
	}
	
}
