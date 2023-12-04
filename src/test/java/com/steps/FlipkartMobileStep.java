package com.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FlipkartMobileStep {

	@Given("^User open flipkart site$")
	public void user_open_flipkart_site() {
		System.out.println("user_open_flipkart_site");
		
	}

	@When("^user check all mobiles$")
	public void user_check_all_mobiles() {
		System.out.println("user_check_all_mobiles");
	}

}
