package com.crm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//form[@class='hero__form'] //input[@name='postal_code_input']")
	WebElement location;

	@FindBy(css = ".button.button--branded.blue.go")
	WebElement go;

	@FindBy(xpath = "//button[@data-test='next_button']")
	WebElement next;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void getHomePage() {
		location.clear();
		location.sendKeys("chennai");
		location.sendKeys(Keys.ARROW_DOWN);
		go.click();
		next.click();
	}

}
