package demo;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ClientCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "http://coop.apps.symfonycasts.com";

		// SessionFilter session=new SessionFilter();
		String response = given().log().all().formParam("client_id", "KrishApplication")
				.formParam("client_secret", "4fe0422b4aec62201c3def68985052cd")
				.formParam("grant_type", "client_credentials").when()
				.post("http://coop.apps.symfonycasts.com/token").then().log().all().assertThat().statusCode(200)
				.body("token_type", equalTo("Bearer")).extract().response().asString();
		JsonPath js = new JsonPath(response);
		String accessToken = js.get("access_token");
		System.out.println(accessToken);

		given().log().all().queryParam("access_token", accessToken).when().post("api/1285/toiletseat-down").then().log()
				.all().assertThat().statusCode(200).body("success", equalTo(true))
				.body("message", equalTo("You just put the toilet seat down. You're a wonderful roommate!"));

		
		  given().log().all().queryParam("access_token", accessToken).when().post("api/1285/chickens-feed")
		  .then().log().all().assertThat().statusCode(401) .body("error",
		  equalTo("insufficient_scope")) .body("error_description",
		  equalTo("The request requires higher privileges than provided by the access token"
		  ));
		  
		 

	}

}
