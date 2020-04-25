package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.AddPayLoad;
import payload.ReusableMethods;
import static org.hamcrest.Matchers.*;

public class DynamicJson {
	public String  id;
	@Test(dataProvider="BooksData")
	public void addBook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166/";
		String response=given().log().all().header("Content-Type", "application/json")
		.body(AddPayLoad.AddBook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js=ReusableMethods.rawToJson(response);
		 id=js.getString("ID");
		System.out.println(id);
		
		RestAssured.baseURI="http://216.10.245.166";
		given().log().all().headers("Content-Type","application/json")
		.body(AddPayLoad.DeleteBook(id))
		.when().delete("/Library/DeleteBook.php")
		.then().log().all().statusCode(200).body("msg",equalTo("book is successfully deleted"));
	}
	
	
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		return new Object[][] {{"a123","4"},{"f456","e256"},{"tg120","bvh259"}};
	}
	
	/*
	@Test(dataProvider="BooksData")
	public void deleteBook(String isbn,String aisle)
	{
		RestAssured.baseURI="http://216.10.245.166";
		given().log().all().headers("Content-Type","application/json")
		.body(AddPayLoad.DeleteBook(id))
		.when().delete("Library/DeleteBook.php")
		.then().log().all().statusCode(200).body("msg",equalTo("book is successfully deleted"));
		
	}*/

}
