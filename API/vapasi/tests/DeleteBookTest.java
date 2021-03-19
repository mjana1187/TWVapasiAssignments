package com.tw.vapasi.tests;

import com.tw.vapasi.requestpack.DeleteBookRequest;
import com.tw.vapasi.responsepack.DeleteBookResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteBookTest {
    @Test
    public void deleteBookByID(){
        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setID("000111111222");

        Response delResponse = given().log().all().header("Content-Type","application/json").body(deleteBookRequest)
                .when().post("/Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        System.out.println("Response "+delResponse);
        DeleteBookResponse deleteBookResponse =delResponse.body().as(DeleteBookResponse.class);
        System.out.println("deleteBookResponse.getMsg()"+ deleteBookResponse.getMsg());
    }
}
