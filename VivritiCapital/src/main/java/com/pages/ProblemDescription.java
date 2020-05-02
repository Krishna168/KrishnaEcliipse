package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class ProblemDescription extends TestBase {

	@FindBy(xpath = "//div[text()='What problem(s) do you have?']")
	WebElement problemDescriptionPageTitle;

	@FindBy(xpath = "//div[text()='Leak in a pipe']/preceding-sibling::div")
	WebElement leakInaPipe;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextInproblemDescriptionPage;

	public ProblemDescription() {
		PageFactory.initElements(driver, this);
	}

	public void getProblemDescription() {
		if (problemDescriptionPageTitle.isDisplayed()) {
			leakInaPipe.click();
			nextInproblemDescriptionPage.click();
		}

	}

}
