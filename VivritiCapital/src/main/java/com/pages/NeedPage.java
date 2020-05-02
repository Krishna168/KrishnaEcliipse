package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class NeedPage extends TestBase {

	@FindBy(xpath = "//div[text()='What do you need done?']")
	WebElement needPageTitle;

	@FindBy(xpath = "//div[text()='Replace']/preceding-sibling::div")
	WebElement replace;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextOnNeedPage;

	public NeedPage() {
		PageFactory.initElements(driver, this);
	}

	public void getNeedPageItems() {
		if (needPageTitle.isDisplayed()) {
			replace.click();
			nextOnNeedPage.click();
		}
	}

}
