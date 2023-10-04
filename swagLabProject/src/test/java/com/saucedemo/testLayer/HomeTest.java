package com.saucedemo.testLayer;

import org.testng.annotations.Test;

import com.saucedemo.pageLayer.HomePage;
import com.saucedemo.pageLayer.LoginPage;
import com.saucedemo.testBase.TestBase;

public class HomeTest extends TestBase
{
   @Test
   public void validateAddToCartButton()
   {
	LoginPage login_obj = new LoginPage(driver);
	HomePage home_obj = new HomePage (driver);
	login_obj.enterUsername("standard_user");
	login_obj.enterpassword("secret_sauce");
	login_obj.clickOnLoginBtn();
	
	home_obj.clickOnFilterIcon();
	home_obj.clickOnThirdoption();
	home_obj.clickOnAddToCartButton();
   }
	
}
