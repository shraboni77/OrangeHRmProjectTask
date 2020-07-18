package com.bitm.SeleniumOnlineProject.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.SeleniumOnlineProject.Utils.DriverManager;
import com.bitm.SeleniumOnlineProject.Utils.UrlTextUtils;
import com.bitm.SeleniumOnlineProject.Utils.XpathUtils;

public class LoginTest {

	private WebDriver driver =null;

	@Test
	public void checkLoginPageTitle()
	{
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.TEXT.HomePageTitle);
	}
	
	@Test(dependsOnMethods = "checkLoginPageTitle")
	public void logintest()
	{
		driver.findElement(By.xpath(XpathUtils.LoginModule.user_name)).sendKeys("Admin");
		driver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys("admin123");
		driver.findElement(By.xpath(XpathUtils.LoginModule.signIN_BTN)).click();		
	}
	
	
}
