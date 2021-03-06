package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_Landing_page() throws Throwable
	{
		//code navigate to login url
		System.out.println("navigated to login url");
	}
	
	
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable
	{
		//code to login
		System.out.println("Logged in success");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated_() throws Throwable
	{
		//home page validation
		System.out.println("Validated home page");
	}
	
	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable
	{
		//validating the cards
		System.out.println("Validated cards");
	}
}

