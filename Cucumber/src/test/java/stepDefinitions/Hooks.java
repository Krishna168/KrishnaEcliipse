package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Automation.Cucumber.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Hooks before mobile test");
	}
	@After("@MobileTest")
	public void AfterValidation()
	{
		System.out.println("Hooks After mobile test");
	}
	
	@Before("@WebTest")
	public void beforeWebValidation()
	{
		System.out.println("Hooks before Web test");
	}
	@After("@WebTest")
	public void AfterWebValidation()
	{
		System.out.println("Hooks After Web test");
	}
	@After("@VegTest")
	public void AfterVegTest() throws InterruptedException
	{
		
		driver.close();
	}

}
