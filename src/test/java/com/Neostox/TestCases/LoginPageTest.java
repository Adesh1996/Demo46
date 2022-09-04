package com.Neostox.TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.NeoStox.Base.TestBase;
import com.NeoStox.Pages.DashBoardPage;
import com.NeoStox.Pages.LoginPage;

@Listeners(com.NeoStox.Utility.ListnerUtility.class)
public class LoginPageTest extends TestBase {
	
	@Test
	public void LoginPageNavigationTest() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.entersdata_In_MobileNumber();
		loginpage.clickSubmit();
		loginpage.entersdata_In_Pin();
		loginpage.clickSubmitPin();
		
		DashBoardPage dashBoardpage = new DashBoardPage(driver);
		dashBoardpage.getTextHeader();
		Assert.assertEquals(dashBoardpage.getTextHeader(), "Hi adesh khedkar");
		
	}
	
	@Test
	public void Logout() {
		
		
	}
	
	@Test
	public void testcas1() {
		
		Assert.fail();
	}
	
	
	
}
