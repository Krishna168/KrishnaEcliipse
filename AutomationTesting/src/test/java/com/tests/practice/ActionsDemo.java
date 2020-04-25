package com.tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"G:\\KrishnaEclipseWorkspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		//Hover the particular element and performing the right click 
		a.moveToElement(move).contextClick().build().perform();
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("HELLO");
		//Enter the given string in capital letters and selecting the entered text
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//drag and drop to be discussed in the frames concept.
		System.out.println("Successful");
		
		
		
		
		
	}

}
