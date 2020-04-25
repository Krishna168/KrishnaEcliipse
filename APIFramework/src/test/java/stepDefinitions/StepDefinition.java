package stepDefinitions;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import static org.junit.Assert.*;

public class StepDefinition {
	RequestSpecification rs;
	ResponseSpecification res;
	Response response;
	@Given("The AddPlace Payload")
	public void the_AddPlace_Payload() {
		AddPlace ap=new AddPlace();
		ap.setAccuracy(50);
		ap.setAddress("29, side layout, cohen 09");
		ap.setLanguage("French-IN");
		ap.setName("Frontline house");
		ap.setPhone_number("Frontline house");
		ap.setWebsite("http://google.com");

		List<String> al=new ArrayList<String>();
		al.add("shoe park");
		al.add("shop");
		ap.setTypes(al);

		Location l=new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		ap.setLocation(l);

		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
		res=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		rs=given().spec(req)
				.body(l).log().all();
	}

	@When("User calls the {string} with the POST http method")
	public void user_calls_the_with_the_POST_http_method(String string) {
		// Write code here that turns the phrase above into concrete actions
		 response=rs.when().post("/maps/api/place/add/json")
				.then().log().all().spec(res).extract().response();
	}

	@Then("The Response should be Success with Status code should be {int}")
	public void the_Response_should_be_Success_with_Status_code_should_be(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(response.getStatusCode(),200);
	}

	@Then("Confirm the {string} field in response should be {string}")
	public void confirm_the_field_in_response_should_be(String ActualKeyValue, String ExpectedKeyValue) {
		// Write code here that turns the phrase above into concrete actions
		String resp=response.asString();
		JsonPath js=new JsonPath(resp);
		assertEquals(js.get(ActualKeyValue).toString(),ExpectedKeyValue);

	}

	



}
