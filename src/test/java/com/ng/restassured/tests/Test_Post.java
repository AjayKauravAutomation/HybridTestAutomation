package com.ng.restassured.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.hasKey;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class Test_Post {
	
	@Test
	public void Post() {

	baseURI= "https://reqres.in/api";

	JSONObject payload=  new JSONObject();
	payload.put("name", "Bryant");
	payload.put("job", "BA");

	given().
	header("Content-Type","application/json").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(payload.toJSONString()).
	when().
	post("/users").
	then().
	statusCode(201).body("$", hasKey("id")).
	assertThat().body(matchesJsonSchemaInClasspath("schemapost.json"));
	}

}
