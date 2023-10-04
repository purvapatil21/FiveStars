package com.saucedemo.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	 private WebDriver driver;
	public LoginPage (WebDriver driver)
		{
			this.driver = driver;
		}
		
		private By username_txtbox = By.xpath("//input[@id='user-name']");
		private By password_txtbox = By.xpath("//input[@id='password']");
		private By login_button = By.xpath("//input[@id='login-button']");
		
		
		public void enterUsername(String username)
		{
			driver.findElement(username_txtbox).sendKeys(username);
		}
		
		public void enterpassword(String password)
		{
			driver.findElement(password_txtbox).sendKeys(password);
		}
		
		public void clickOnLoginBtn()
		{
			driver.findElement(login_button).click();;
		}
}
