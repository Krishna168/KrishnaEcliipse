package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepDefinitions {
	WebDriver driver;

    @Given("^The user is on GreenKart Landing Page$")
    public void the_user_is_on_greenkart_landing_page() throws Throwable {
       System.setProperty("webdriver.chrome.driver", "G:\\KrishnaEclipseWorkspace\\drivers\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       driver.manage().window().maximize();
       
    }

    @When("^The user searches for \"([^\"]*)\" vegetable$")
    public void the_user_searches_for_something_vegetable(String VegName) throws Throwable {
    	driver.findElement(By.cssSelector("input.search-keyword")).sendKeys(VegName);
    	Thread.sleep(3000);
        
    }

    @Then("^Validate the \"([^\"]*)\" search results are displayed$")
    public void validate_the_something_search_results_are_displayed(String VegName) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(VegName));
    }
    @Then("^Verify selected \"([^\"]*)\" items are displayed in the checkout page$")
    public void verify_selected_something_items_are_displayed_in_the_checkout_page(String VegName) throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//table/tr[2]/td[2]/p")).getText().contains(VegName));
    }

    @And("^User adding the item to the cart$")
    public void user_adding_the_item_to_the_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    }

    @And("^User proceeded to the checkout page for purchase$")
    public void user_proceeded_to_the_checkout_page_for_purchase() throws Throwable {
       driver.findElement(By.xpath("//img[@alt='Cart']")).click();
       driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
       Thread.sleep(5000);
    }
    
    

}