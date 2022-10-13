package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;



public class RestUtils {
	
	static Response response;
	
	public static void setBaseUri(String uri) {
		baseURI = uri;
	}
	public static String getBaseUri() {
		return baseURI;
	}
	
	public static Object getResponse(String key) {
		return response.getBody().jsonPath().get(key);
	}
	
	public static void validaStatusCode(int status) {
		assertEquals(status, response.getStatusCode());
	}
	
	public static int getStatusCode() {
		return response.getStatusCode();
	}
	
	public static String getBody() {
		return response.getBody().asString();
	}
	
	public static void getRequest(String endpoint) {
		response =
				given()
				.relaxedHTTPSValidation()
				.when()
				.get(endpoint)
				.then()
				.extract()
				.response();
	}
	
	public static void getRequest(String endpoint, LinkedHashMap<String, String> header) {
		response =
				given()
				.relaxedHTTPSValidation()
				.headers(header)
				.when()
				.get(endpoint)
				.then()
				.extract()
				.response();
	}
	
	public static void getRequest(String endpoint, LinkedHashMap<String, String> header, LinkedHashMap<String, String> params) {
		response =
				given()
				.relaxedHTTPSValidation()
				.headers(header)
				.params(params)
				.when()
				.get(endpoint)
				.then()
				.extract()
				.response();
	}
	
	public static void postRequest(String endpoint, Object json) {
		response = 
				given()
				.relaxedHTTPSValidation()
				.contentType(ContentType.JSON)
				.body(json)
				.when()
				.post(endpoint)
				.then()
				.extract()
				.response();
	}
	
	public static void postRequest(String endpoint, LinkedHashMap<String, String> header, Object json) {
		response = 
				given()
				.relaxedHTTPSValidation()
				.headers(header)
				.contentType(ContentType.JSON)
				.body(json)
				.when()
				.post(endpoint)
				.then()
				.extract()
				.response();
	}
	
	public static void postRequestFormParams(String endpoint, LinkedHashMap<String, String> header, LinkedHashMap<String, String> json) {
		response = 
				given()
				.relaxedHTTPSValidation()
				.headers(header)
				.contentType(ContentType.JSON)
				.formParams(json)
				.when()
				.post(endpoint)
				.then()
				.extract()
				.response();
	}
}
