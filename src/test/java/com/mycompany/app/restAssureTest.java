package com.mycompany.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;

/**
 * Unit test for simple App.
 */
public class restAssureTest 
{
    @Test
        public void BmiInputs18_5to25ShouldBeNormal()
        {
            RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
            // RequestSpecification httpRequest = RestAssured.given();
            // Response response = httpRequest.get("/Hyderabad");
        
            // // First get the JsonPath object instance from the Response interface
            // JsonPath jsonPathEvaluator = response.jsonPath();
        
            // // Then simply query the JsonPath object to get a String value of the node
            // // specified by JsonPath: City (Note: You should not put $. in the Java code)
            // String city = jsonPathEvaluator.get("City");
        
            // // Let us print the city variable to see what we got
            // System.out.println("City received from Response " + city);
        
            // // Validate the response
            // assertEquals(city,"Hyderabad");
            // //Assert.assertEquals(city, "Hyderabad", "Correct city name received in the Response");
        }
    
        // @Tests
        // public void InvalidBmiInputsShouldreturnvalidationerror()
        // {
        //     given().
        //         queryParam("weight", "0").
        //         queryParam("height", "0").
        //     when().
        //         get("http://sampleapi.azurewebsites.net/api/bmi").
        //     then().    
        //         statusCode(400);
        // }
    }
