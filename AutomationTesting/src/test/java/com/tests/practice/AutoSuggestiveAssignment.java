package com.tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveAssignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krishna\\eclipse-workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys("ind");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.ARROW_DOWN);
		//String country = driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).getText();
		//System.out.println(country);

		
		/*Using javascript executor to get the text
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String country = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(country);
		System.out.println(text);*/
		
		//Using getAttribute Method to get the text
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).getAttribute("value"));
		

	}

}
