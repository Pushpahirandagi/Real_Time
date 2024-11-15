package com.digisoft.actitime.seleniumautomation.test;

import com.digisoft.actitime.seleniumautomation.page.loginpage;
import com.digisoft.actitime.seleniumautomation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ActitimeStepDefinition  extends DriverUtils
{
	loginpage lp = null;
	
	@Given("User is launch the browser")
	public void user_is_launch_the_browser() {
		System.out.println("***** Hey im inside the browser *****");
		initDriver();
		lp = new loginpage();
		driver.get("http://localhost/login.do");
	}

	@When("User  enter (.*) and (.*)$")
	public void user_enter_admin_and_manager(String name,String password) throws InterruptedException {
		Thread.sleep(2000);
		lp.enterUsername(name);
		lp.enterPassword(password);
	}
	

	@When("User click on the login button")
	public void user_click_on_the_login_button() {
		lp.clickLoginButton();
	}
	

	@Then("User should be naviagte to homepage")
	public void user_should_be_naviagte_to_homepage() {
	    System.out.println("##### Hey im inside the homepage ####");
	}

}
