package com.gp.steps;

import com.gp.testbase.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PGHomePageSteps extends BaseClass{
	
	@Given("I enter correct url")
	public void i_enter_correct_url() {
	    launchGeniusPlaza();
	}

	@Then("I shold get url tittle")
	public void i_shold_get_url_tittle() {
	    System.out.println("Test completed");
	}
}
