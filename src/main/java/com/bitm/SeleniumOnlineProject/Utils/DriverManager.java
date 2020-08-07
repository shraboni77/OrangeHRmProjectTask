package com.bitm.SeleniumOnlineProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	static {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shraboni\\Documents\\selenium folder\\geckodriver.exe");
	}

	public static WebDriver driver = new FirefoxDriver();

	private DriverManager() {

	}

}
