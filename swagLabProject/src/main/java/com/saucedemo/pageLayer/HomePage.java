package com.saucedemo.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
	private WebDriver driver;
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	private By filter_icon = By.xpath("//select[@class='product_sort_container']");
	private By filter_dropdown = By.xpath("//option[@value='lohi']");
	private By addToCart_click = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	
	
	public void clickOnFilterIcon()
	{
		driver.findElement(filter_icon).click();
	}
	
	public void clickOnThirdoption()
	{
		driver.findElement(filter_dropdown).click();
	}
	
	public void clickOnAddToCartButton()
	{
		driver.findElement(addToCart_click).click();
	}
	

}
