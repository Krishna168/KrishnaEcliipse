package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class PlumberAddInfo extends TestBase {

	@FindBy(xpath = "//div[text()='Is there anything else that the Plumber needs to know?']")
	WebElement plumberAddInfoTitle;

	@FindBy(xpath = "//textarea[@data-test='step_4']")
	WebElement optionalTextBox;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextInPlumberAddInfoPage;

	public PlumberAddInfo() {
		PageFactory.initElements(driver, this);
	}

	public void getplumberAdditionalInfoPage() {
		if (plumberAddInfoTitle.isDisplayed()) {
			optionalTextBox.sendKeys("Sample Text");
			nextInPlumberAddInfoPage.click();
		}
	}

}
