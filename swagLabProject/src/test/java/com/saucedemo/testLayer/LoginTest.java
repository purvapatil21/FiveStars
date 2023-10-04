package com.saucedemo.testLayer;

import org.testng.annotations.Test;

import com.saucedemo.pageLayer.LoginPage;
import com.saucedemo.testBase.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void verifyLoginWithCred()
	{
		LoginPage login_obj = new LoginPage(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterpassword("secret_sauce");
		login_obj.clickOnLoginBtn();
	}
}
