package Demo.VivritiCapital;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\KrishnaEclipseWorkspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#/");
        driver.findElement(By.xpath("//form[@class='hero__form'] //input[@name='postal_code_input']")).sendKeys("Chennai");
        driver.findElement(By.cssSelector(".button.button--branded.blue.go")).click();
        
        System.out.println(System.getProperty("user.dir"));
	}
}
