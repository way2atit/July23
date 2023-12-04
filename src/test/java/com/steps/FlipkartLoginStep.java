package com.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FlipkartLoginStep {

	public static WebDriver driver = null;

	@Given("^user navigate ot flipkart$")
	public void user_navigate_ot_flipkart() {
		System.out.println("user_navigate_to_login_page");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	}

	@When("^User entered  valid username$")
	public void user_entered_valid_username() {
	}

	@When("^user entered valid pass$")
	public void user_entered_valid_pass() {

	}

	@When("^user entered username \"([^\"]*)\"$")
	public void user_entered_username(String uname) throws InterruptedException {
		System.out.println("user_entered_username " + uname);

		System.out.println("user_Entered_username");
		Thread.sleep(2000);
		WebElement username_txt = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		username_txt.sendKeys(uname);
	}

	@When("^user entered  pass \"([^\"]*)\"$")
	public void user_entered_pass(String pass) throws InterruptedException {
		Thread.sleep(2000);

		System.out.println("user_entered_password");
		WebElement username_txt = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		username_txt.sendKeys(pass);
		System.out.println("user_entered_pass" + pass);
	}

	
}
