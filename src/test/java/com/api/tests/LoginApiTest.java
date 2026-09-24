package com.api.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApiTest {
	
	@Test(description = "Verify login API is working ..")
    public void LoginAPITest() {
		
		RestAssured.baseURI="http://62.277.160.186:8080";
		RequestSpecification x= RestAssured.given();
		RequestSpecification y= x.header("content-Type","application/json");
		RequestSpecification z= y.body("{\"username\":\"uday1234\", \"password\" : \"uday1234\"}");
	    Response response = z.post("/api/auth/login");
	    System.out.println(response.asPrettyString());
	    
	    Assert.assertEquals(response.statusCode(), 2112);
	}
}
