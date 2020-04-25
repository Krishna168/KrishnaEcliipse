package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefinition extends Utils {
	  
	RequestSpecification rs;
	ResponseSpecification res;
	Response response;
	TestDataBuild td=new TestDataBuild();	


	@Given("The AddPlace Payload with {string} {string} {string}")
	public void the_AddPlace_Payload_with(String name, String language, String address) throws IOException {
		rs=given().spec(requestSpecification())
				.body(td.addPlacePayLoad(name,language,address));
	}

	@When("User calls the {string} with the POST http method")
	public void user_calls_the_with_the_POST_http_method(String string) {
		res=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response=rs.when().post("/maps/api/place/add/json")
				.then().spec(res).extract().response();
	}

	@Then("The Response should be Success with Status code should be {int}")
	public void the_Response_should_be_Success_with_Status_code_should_be(Integer int1) {

		assertEquals(response.getStatusCode(),200);
	}

	@Then("Confirm the {string} field in response should be {string}")
	public void confirm_the_field_in_response_should_be(String ActualKey, String ExpectedKeyValue) {

		String resp=response.asString();
		JsonPath js=new JsonPath(resp);
		assertEquals(js.getString(ActualKey),ExpectedKeyValue);
		//Assert.assertEquals(ExpectedKeyValue, ActualKeyValue);--->this method is depreciated.

	}





}
