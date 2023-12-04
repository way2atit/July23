package com.steps;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStep extends BrowserLaunch {

	@Given("^User navigate to amazon site$")
	public void user_navigate_to_amazon_site() {
		/*
		 * System.out.println("user_navigate_to_amazon_site"); driver = new
		 * ChromeDriver(); driver.manage().window().maximize();
		 */

		driver = open_browser();
		driver.get("https://www.amazon.in/");
	}

	@When("^user click on mobile link$")
	public void user_click_on_mobile_link() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("user_click_on_mobile_link");
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();

	}

	@When("^user click on Today's Deals link$")
	public void user_click_on_Today_s_Deals_link() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("user_click_on_Today_s_Deals_link");
		driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();
	}

	@Then("^close browser$")
	public void close_browser() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Close Browser");
		close_browser1();
	}

	@Given("^User navigate to Flipkart site$")
	public void user_navigate_to_Flipkart_site() 
	{
		driver = open_browser();
		driver.get("https://www.flipkart.com/");
	}

}
