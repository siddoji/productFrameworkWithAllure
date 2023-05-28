package commonFunction;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class General_Function {
	
	public static int Pr_statusCode(String baseURI, String resource, String requestBody) {
		
		RestAssured.baseURI=baseURI;
		
		int statusCode=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().statusCode();
		return statusCode;
	}
	
	public static String Pr_responseBody(String baseURI,String resource,String requestBody) {
		
		RestAssured.baseURI=baseURI;
		
		String responseBody=given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
		return responseBody;
	}

}
