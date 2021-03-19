package com.tw.vapasi.tests;

import com.tw.vapasi.requestpack.AddBookRequest;
import com.tw.vapasi.requestpack.DeleteBookRequest;
import com.tw.vapasi.responsepack.AddBookAndGetResponse;
import com.tw.vapasi.responsepack.AddBookResponse;
import com.tw.vapasi.responsepack.DeleteBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class AddBookAndGetBookByIDAPITest {

    Random random = new Random();
    int iUniqueNumber = random.nextInt(100);

    @BeforeTest
    public void launchHost() {
        RestAssured.baseURI = "http://216.10.245.166";
    }

    @Test(priority = 2)
    public void addBookAndGetID() {

        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setBookName("Book Added through API Automation");
        addBookRequest.setIsbn("000111");
        addBookRequest.setAisle(iUniqueNumber);
        addBookRequest.setAuthorName("Author777");

        Response addResponse = given().log().all().header("Content-Type", "application/json").body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();
        System.out.println("Response " + addResponse.getBody().asString());

        AddBookAndGetResponse addBookAndGetResponse = addResponse.body().as(AddBookAndGetResponse.class);
        Assert.assertEquals(addBookAndGetResponse.getMsg(), "successfully added");
        System.out.println(addBookAndGetResponse.getMsg() + "," + addBookAndGetResponse.getId());
    }

    @Test(priority=3)
    public void addDuplicateBook() {

        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setBookName("Book Added through API Automation");
        addBookRequest.setIsbn("000111");
        addBookRequest.setAisle(76);
        addBookRequest.setAuthorName("Author777");

        Response addDupResponse = given().log().all().header("Content-Type", "application/json").body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(404).extract().response();

        System.out.println("Response " + addDupResponse.getBody().asString());
        AddBookResponse addBookDupResponse = addDupResponse.as(AddBookResponse.class);
        Assert.assertEquals(addBookDupResponse.getMsg(), "Add Book operation failed, looks like the book already exists");
        System.out.println("AddDuplicateBook- Response = " + addDupResponse.getBody().asString());
        //return addBookDupResponse;
    }

    @Test(priority = 1)
    public void deleteBookByID() {
        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setID("00011182");

        Response delResponse = given().log().all().header("Content-Type", "application/json").body(deleteBookRequest)
                .when().post("/Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        System.out.println("Response " + delResponse.asString());
        DeleteBookResponse deleteBookResponse = delResponse.body().as(DeleteBookResponse.class);
        Assert.assertEquals(deleteBookResponse.getMsg(), "book is successfully deleted");
        System.out.println("deleteBookResponse.getMsg() is : " + deleteBookResponse.getMsg());
    }
}


















/*@Test(priority = 3)
        public void addDuplicateBook(AddBookAndGetResponse addBookAndGetResponse){

        Response getResponse = given().queryParam("ID",addBookAndGetResponse.getId()).header("Content-Type","application/json")
                .body(addBookAndGetResponse)
                .when().get("Library/GetBook.php")
                .then().statusCode(404).extract().response();

        System.out.println("AddDuplicateBook- Response = "+ getResponse.getBody().asString());
        AddBookAndGetResponse addBookAndGetResponses =getResponse.as(AddBookAndGetResponse.class);
        Assert.assertEquals(addBookAndGetResponses.getMsg(),"Add Book operation failed, looks like the book already exists");
    }*/
