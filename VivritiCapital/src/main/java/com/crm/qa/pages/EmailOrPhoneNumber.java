package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.crm.qa.base.TestBase;

public class EmailOrPhoneNumber extends TestBase {

	@FindBy(xpath = "//div[text()='Get responses faster with SMS notifications.']")
	WebElement phoneNumberPageTitle;

	@FindBy(id = "PHONE_NUMBER")
	WebElement phoneNumberTextBox;

	@FindBy(xpath = "//div[text()='Where would you like us to notify you about new quotes received on your request?']")
	WebElement emailAddressPageTitle;

	@FindBy(xpath = "//input[@placeholder='Email address']")
	WebElement emailAddressTextBox;

	/*
	 * @FindBy(xpath = "//button[text()='Next']") 
	 * WebElement nextInEmailPage;
	 */

	public EmailOrPhoneNumber() {
		PageFactory.initElements(driver, this);
	}

	public void getEmailOrPhoneNumberField() {	
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(phoneNumberTextBox.isDisplayed());
		sa.assertTrue(emailAddressTextBox.isDisplayed());

	}

}


