package test_api;

import static io.restassured.RestAssured.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class TestOne {

	ExtentReports report;
	ExtentTest logger;
	@BeforeTest
	public void report() {
		report=new ExtentReports("./test-output/TestReport.html");
	}
	
	@Test(priority=1,description="GET method")
	public void testGET() {
		
		logger=report.startTest("GET");
		logger.log(LogStatus.INFO, "GET test started ");
		
		given().get("https://reqres.in/api/users?page=2").then().
		statusCode(200).
		body("data.id[1]", equalTo(8)).
		body("data.first_name", hasItems("Michael","Lindsay")).
		log().all();
		
		logger.log(LogStatus.PASS, "Test Verified");

	}
	@SuppressWarnings("unchecked")
	@Test(priority=2,description="POST method")
	public void testPOST() {
		
		logger=report.startTest("POST");
		logger.log(LogStatus.INFO, "POST test started ");
		
		JSONObject request = new JSONObject();
		request.put("name", "shikha");
		request.put("job", "Teacher");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201 );
		logger.log(LogStatus.PASS, "Test Verified");

	}
	
	@Test(priority=3,description="DELETE method")
	public void testDELETE() {
		
		
		logger=report.startTest("DELETE");
		logger.log(LogStatus.INFO, "DELETE test started ");
		
		JSONObject request = new JSONObject();
		given().
		body(request.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).
		log().all();
		
		logger.log(LogStatus.PASS, "Test Verified");

	}
	
	
	@Test(priority=4,description="PUT method")
	public void testPUT() {
		
		logger=report.startTest("PUT");
		logger.log(LogStatus.INFO, "PUT test started ");
		
		JSONObject request = new JSONObject();
		request.put("name", "shikha");
		request.put("job", "teacher");

		System.out.println(request);
		System.out.println(request.toString());
		baseURI="https://reqres.in/api";
		given().
		body(request.toJSONString()).
		when().
		put("/users/2").
		then().statusCode(200);
		logger.log(LogStatus.PASS, "Test Verified");

	}
	

	@AfterTest
	public void endReport() {
		report.endTest(logger);
		
		//Flush the data to report
		report.flush();
	}
}
