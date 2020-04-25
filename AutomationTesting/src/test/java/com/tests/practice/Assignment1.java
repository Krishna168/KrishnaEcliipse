package com.tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Krishna\\\\eclipse-workspace\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		// driver.switchTo().alert().dismiss();
		Select A = new Select(driver.findElement(By.name("adults")));
		A.selectByIndex(5);
		Select C = new Select(driver.findElement(By.id("Childrens")));
		C.selectByVisibleText("3");
		Select I = new Select(driver.findElement(By.id("Infants")));
		I.selectByValue("1");
		driver.findElement(By.xpath("//input[@title='Depart date']")).click();
		Thread.sleep(3000);
		// To click on the current date

		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		// driver.findElement(By.xpath("//i[@class='blue rArrow']")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("indigo");
		driver.findElement(By.xpath("//input[@title='Search flights']")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		System.out.println("Cleartrip testcase is successful");
		driver.close();

	}

}
