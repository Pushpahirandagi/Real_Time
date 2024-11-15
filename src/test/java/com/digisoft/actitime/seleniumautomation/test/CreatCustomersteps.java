package com.digisoft.actitime.seleniumautomation.test;

import org.openqa.selenium.WebDriver;

import com.digisoft.actitime.seleniumautomation.page.CustomerPage;
import com.digisoft.actitime.seleniumautomation.page.loginpage;
import com.digisoft.actitime.seleniumautomation.utils.DriverUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatCustomersteps extends DriverUtils
{
	
	private static final String USERNAME = null;
	private static final String PASSWORD = null;
	CustomerPage CP = null;
	loginpage LP = null;
	WebDriver driver;
	
	@Given("User is on Actitime Login page")
	public void user_is_on_actitime_login_page() {
		initDriver();
		LP = new loginpage();
		CP = new CustomerPage();
		driver.get("http://localhost/login.do");
			   
	}

	@Given("User login to the application with valid credentials")
	public void user_login_to_the_application_with_valid_credentials() {
		LP.enterUsername(USERNAME);
		LP.enterPassword(PASSWORD);
		LP.clickLoginButton();
	}

	@When("User click on tasks followed by create customer button")
	public void user_click_on_tasks_followed_by_create_customer_button() {
		CP.navigateToCreateCustomer();
		    
	}

	@Then("User validates the customer creation page")
	public void user_validates_the_customer_creation_page() {
		boolean isDisplayed = CP.CustomerCreatedform();
		if(isDisplayed) {
			System.out.println("Customer Creation page is validated");
		} else {
			System.out.println("Customer Creation page validation failed");
		}
	    
	}

	@Then("Fill all the customer details and click on create customer button")
	public void fill_all_the_customer_details_and_click_on_create_customer_button() {
		CP.createCustomer("Default Customer", "Default Description");
	    
	}

	@Then("Customer will be created successfully")
	public void customer_will_be_created_successfully() {
		System.out.println("Customer created successfully");
	    
	}

	@Then("User validates the success message")
	public void user_validates_the_success_message() {
		CP.validateSuccessMessage();
	    
	}

	@Then("Fill name1 and {int} and click on create customer button")
	public void fill_name1_and_and_click_on_create_customer_button(Integer int1) {
		String customerName = "Pushpa" + 243678;
		CP.createCustomer(customerName, "Description for" + customerName);
	    
	}

	@Then("Fill name2 and {int} and click on create customer button")
	public void fill_name2_and_and_click_on_create_customer_button(Integer int1) {
		String customerName = "Laxmi" + 1243678;
		CP.createCustomer(customerName, "Description for" + customerName);
		
	   
	}




}

	