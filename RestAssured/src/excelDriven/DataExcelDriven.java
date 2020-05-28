package excelDriven;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import payload.ReusableMethods;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.json.JSONObject;

public class DataExcelDriven {

	public static void main(String[] args) {
		
		HashMap<String, String> map= new HashMap<String, String>();
		map.put("name", "acd");
		map.put("isbn", "benk");
		map.put("aisle", "4125");
		map.put("author", "krrish");
		JSONObject json = new JSONObject(map);
		
		/* For nested json, the hashmap should be as below
		 * HashMap<String, Object> map2= new HashMap<String, Object>(); 
		 * map2.put("lat","-36.25369"); 
		 * map2.put("lng", "25.01256"); 
		 * map.put("location", map2);
		 */
		

		RestAssured.baseURI = "http://216.10.245.166";
		Response resp = given().log().all().header("Content-Type", "application/json")
				.body(map)
				.then().log().all().assertThat().statusCode(200).extract().response();
		String resp1 = resp.asString();
		JsonPath js = ReusableMethods.rawToJson(resp1);
		String id = js.get("ID").toString();
		System.out.println(id);
	}

}
