package databaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		
//jdbc:mysql://"+host+":"+port+"/databasename;
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root" ,"Krishna12345.");
		Statement s=con.createStatement();//like a road.
		ResultSet rs=s.executeQuery("select * from Employeeinfo where name='sam'");
		while(rs.next())
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\auto\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			
		System.out.println(rs.getString("location"));
		System.out.println(rs.getString("age"));
		
		driver.findElement(By.id("username")).sendKeys(rs.getString("location"));
		driver.findElement(By.id("password")).sendKeys(rs.getString("age"));
		}
	}

}
