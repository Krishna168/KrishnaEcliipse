package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("^The user is on the Netbanking landing page$")
	public void the_user_is_on_the_netbanking_landing_page() throws Throwable {
		System.out.println("Navigated to login page");
	}

	@When("^The user logs into the application with username and password$")
	public void the_user_logs_into_the_application_with_username_and_password() throws Throwable {
		System.out.println("Entered username and password");
	}

	@Then("^HomePage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		System.out.println("HomePage is displayed");
	}

	@And("^The user should be able to see all the cards$")
	public void the_user_should_be_able_to_see_all_the_cards() throws Throwable {
		System.out.println("All Cards are displayed");
	}

}