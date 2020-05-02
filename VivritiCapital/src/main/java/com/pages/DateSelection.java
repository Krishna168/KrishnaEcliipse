package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class DateSelection extends TestBase {

	@FindBy(xpath = "//div[text()='On what date?']")
	WebElement dateSelectionPageTitle;

	@FindBy(xpath = "(//button[text()='20'])[2]")
	WebElement dateSelection;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextInDateSelectionPage;

	public DateSelection() {
		PageFactory.initElements(driver, this);
	}

	public void getDatePage() {
		if (dateSelectionPageTitle.isDisplayed()) {
			dateSelection.click();
			nextInDateSelectionPage.click();
		}
	}

}
