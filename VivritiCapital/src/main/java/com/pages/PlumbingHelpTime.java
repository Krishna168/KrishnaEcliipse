package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class PlumbingHelpTime extends TestBase {

	@FindBy(xpath = "//div[text()='When do you require plumbing?']")
	WebElement plumbingHelpTimePageTitle;

	@FindBy(xpath = "//div[text()='On a specific date']/preceding-sibling::div")
	WebElement onaSpecificDate;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextInPlumbingHelpTimePage;

	public PlumbingHelpTime() {
		PageFactory.initElements(driver, this);
	}

	public void geTimeOfPlumbingPage() {
		if (plumbingHelpTimePageTitle.isDisplayed()) {
			onaSpecificDate.click();
			nextInPlumbingHelpTimePage.click();
		}
	}

}
