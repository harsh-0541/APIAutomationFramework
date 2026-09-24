package com.api.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginApiTest2 {
	
	@Test(description = "Verify login API is working ..")
    public void LoginAPITest() {
		
		baseURI="http://62.277.160.186:8080";
		Response response =	given().header("content-Type","application/json").
		body("{\"username\":\"uday1234\", \"password\" : \"uday1234\"}").post("/api/auth/login");
	    System.out.println(response.asPrettyString());
	    
	    Assert.assertEquals(response.statusCode(), 2112);
	}
}
