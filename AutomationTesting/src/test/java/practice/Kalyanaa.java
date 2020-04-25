package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kalyanaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\KrishnaEclipseWorkspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kalyanaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='big-font-top-menu'])[3]")).click();
		driver.findElement(By.id("login-username")).sendKeys("5870");
		driver.findElement(By.id("login-password")).sendKeys("raga12345");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.cssSelector(".dropdown-toggle.big-font-top-menu")).click();
		driver.findElement(By.xpath("//li/a[text()='Quick Search ']")).click();
		Select s=new Select(driver.findElement(By.id("agefrm")));
		s.selectByValue("20");
		Select d=new Select(driver.findElement(By.id("ageto")));
		d.selectByIndex(6);
		Select f=new Select(driver.findElement(By.id("subcaste")));
		f.selectByVisibleText("Madhwa Desistha");
		driver.findElement(By.id("qs-btn-submit")).click();
		String text =driver.findElement(By.xpath("(//div/h3)[2]")).getText();
		System.out.println("Madhwa Deshishta is " +text);
		
		
				
		
		driver.findElement(By.cssSelector(".dropdown-toggle.big-font-top-menu")).click();
		driver.findElement(By.xpath("//li/a[text()='Quick Search ']")).click();
		Select s1=new Select(driver.findElement(By.id("agefrm")));
		s1.selectByValue("20");
		Select d1=new Select(driver.findElement(By.id("ageto")));
		d1.selectByIndex(6);
		Select f1=new Select(driver.findElement(By.id("subcaste")));
		f1.selectByVisibleText("Madhwa Kannada");
		driver.findElement(By.id("qs-btn-submit")).click();
		String text1 =driver.findElement(By.xpath("(//div/h3)[2]")).getText();
		System.out.println("Madhwa Kannada is " +text1);
		
		
		driver.findElement(By.xpath("(//a[@class='big-font-top-menu'])[2]")).click();
		driver.close();


	}

}
