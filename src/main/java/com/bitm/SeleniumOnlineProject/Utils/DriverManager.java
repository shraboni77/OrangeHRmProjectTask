package com.bitm.SeleniumOnlineProject.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	static {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shraboni\\Documents\\selenium folder\\chromedriver.exe");
	}

	public static WebDriver driver = new ChromeDriver();

	private DriverManager() {

	}

}
