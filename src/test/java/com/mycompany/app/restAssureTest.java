package com.mycompany.app;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import io.restassured.RestAssured;
//import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class restAssureTest {

    @Test
    public void swapiTest() {
        RestAssured.baseURI = "https://swapi.dev/api/films";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/1");
        System.out.println("content type " + response.then().extract().contentType());
        System.out.println("status code " + response.then().extract().statusCode());
        // First get the JsonPath object instance from the Response interface
        JsonPath jsonPathEvaluator = response.jsonPath(); 

        List<String> charactersList = jsonPathEvaluator.get("characters");
        assertEquals(charactersList.size(), 18);

        String title = jsonPathEvaluator.get("title");
        int episode_id = jsonPathEvaluator.get("episode_id");
        String opening_crawl = jsonPathEvaluator.get("opening_crawl");
        String director = jsonPathEvaluator.get("director");
        String producer = jsonPathEvaluator.get("producer");
        String release_date = jsonPathEvaluator.get("release_date");

        // Let us print the city variable to see what we got
        System.out.println("response: " + "\n" + title + "\n" + episode_id + "\n" + opening_crawl + "\n" + director
                + "\n" + producer + "\n" + release_date);

        String jsonstring = response.asString();
        // Validate the response
        assertEquals(jsonstring.contains("A New Hope"), true);
        // Assert.assertEquals(city, "Hyderabad", "Correct city name received in the
        // Response");
    }

    @Test
    public void watherTest() {

        RestAssured.baseURI = "https://bookstore.toolsqa.com/";
        RequestSpecification request = RestAssured.given();
        Response response = request.get("BookStore/v1/Books");
   

        System.out.println(response.getStatusCode()); 
        
        String jsonstring = response.asString();
        JsonPath jsonPathEvaluator = response.jsonPath();

        List<String> books = jsonPathEvaluator.get("books");
        

        System.out.println(books); 

        assertEquals(jsonstring.contains("Learning JavaScript Design Patterns"), true);



    }
}
