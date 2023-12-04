package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static WebDriver driver = null;

	public WebDriver open_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		return driver;
	}

	public void close_browser1() {

		driver.close();
	}

}
