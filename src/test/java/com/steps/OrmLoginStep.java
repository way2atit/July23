package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrmLoginStep {

	public static WebDriver driver = null;
	
	@Given("^user navigate to login page$")
	public void user_navigate_to_login_page() {
		System.out.println("user_navigate_to_login_page");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user Entered username$")
	public void user_Entered_username() throws InterruptedException {
		System.out.println("user_Entered_username");
		Thread.sleep(2000);
		WebElement username_txt = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		username_txt.sendKeys("Admin");

	}

	@When("^user entered password$")
	public void user_entered_password() throws InterruptedException {
		Thread.sleep(2000);
		
		System.out.println("user_entered_password");
		WebElement username_txt = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		username_txt.sendKeys("admin123");

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("user_click_on_login_button");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		
	}

}
