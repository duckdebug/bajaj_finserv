package test_api;
import org.json.simple.JSONObject;
import org.testng.Assert;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class Demo {
	@Test
	public void test_1() {

		Response response = get("https://reqres.in/api/users?page=2");

		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));

		int statusCode = response.getStatusCode();

		Assert.assertEquals(statusCode, 200);

	}
	public void test_2() {

		baseURI = "https://reqres.in/api";

		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[1].id", equalTo(8))
		.log().all();

	}
	public void testPost() {

		Map<String, Object> map = new HashMap<String, Object>();

		//	map.put("name", "shikha");
		//	map.put("job", "Teacher");
		//	
		//	System.out.println(map);

		JSONObject request = new JSONObject();

		request.put("name", "Shikha");
		request.put("job", "Teacher");

		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";

		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201)
		.log().all();


	}


}
