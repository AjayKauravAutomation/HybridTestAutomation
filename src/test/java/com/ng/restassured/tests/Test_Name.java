package com.ng.restassured.tests;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
public class Test_Name {
public String baseURL ="https://reqres.in/api/users?page=2";
	@Test
	public void name() {
	given().get(baseURL).then().statusCode(200).body("data[3].first_name", equalTo("Byron"));
	
	}
	}
