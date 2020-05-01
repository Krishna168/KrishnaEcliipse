package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class ProblemItem extends TestBase {

	@FindBy(xpath = "//div[text()='The problems are to do with which of the following things?']")
	WebElement problemItemsPageTitle;

	@FindBy(xpath = "//div[text()='Tap']/parent::label/div/div")
	WebElement tap;

	@FindBy(xpath = "//button[@data-test='next_button']")
	WebElement nextOnProblemsPage;

	
	public ProblemItem() {
		PageFactory.initElements(driver, this);
	}

	public void getproblemsFacingItems() {
		if (problemItemsPageTitle.isDisplayed()) {
			tap.click();
			nextOnProblemsPage.click();
		}

	}

}
