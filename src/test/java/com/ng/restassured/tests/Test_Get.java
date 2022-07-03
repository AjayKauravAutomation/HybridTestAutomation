package com.ng.restassured.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_Get {
	
		
@Test
	public void test() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		int statusCode =response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		
		               }


                     }
