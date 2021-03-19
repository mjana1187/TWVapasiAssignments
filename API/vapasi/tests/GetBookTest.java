package com.tw.vapasi.tests;

import com.tw.vapasi.responsepack.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetBookTest {

    @Test
    public void getBookByID(){
        RestAssured.baseURI="http://216.10.245.166";

        Response response = given().queryParam("ID","1112131411121314").header("Content-Type","application/json")
                .when().get("Library/GetBook.php")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println("response ++ ----" + response.asString());

        GetBookResponse getBookResponse = response.body().as(GetBookResponse.class);
        System.out.println(getBookResponse.getAisle()+getBookResponse.getIsbn());
        //Assert.assertEquals(getBookResponse.getAisle()+getBookResponse.getIsbn(),123124);
                //(getID,getBookResponse.);*/
    }

}
