package com.test.bdd.stepdefinations;

import com.test.bdd.core.Helpers;
import com.test.bdd.pageobject.HomePagePO;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Helpers {
	Scenario scenario;
	Helpers help = new Helpers();
	HomePagePO homePagePO = new HomePagePO();

	@Before
	public void beforeAllTest(Scenario scenario) {
		try {
			System.out.println("i am here trying");
			this.scenario = scenario;
			Helpers.scenario = scenario;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Given("user is launched application on chrome")
	public void user_is_launched_application_on_chrome() {
		// Write code here that turns the phrase above into concrete actions
		help.crateWebDriverInstance();
		help.launchApplication();
		driver.findElement(homePagePO.login).click();
		Helpers.scenario.log("Successfullt clicked on the login button");
		driver.findElement(homePagePO.email).sendKeys(help.config.get("email").toString());
		Helpers.scenario.log("User name entered in the email field "+help.config.get("email").toString());
		driver.findElement(homePagePO.pass).sendKeys(help.config.get("pass").toString());
		Helpers.scenario.log("User name entered in the password field "+help.config.get("pass").toString());
		driver.findElement(homePagePO.login).click();
		Helpers.scenario.log("Successfullt clicked on the login button");
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	}

	@When("when user enters username and password")
	public void when_user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("when user enters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");
	}

}
