package com.tw.vapasi.tests;

import com.tw.vapasi.requestpack.AddBookRequest;
import com.tw.vapasi.requestpack.DeleteBookRequest;
import com.tw.vapasi.responsepack.GetBookByAuthorResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AddGetDelBookMethods {

    public Response addBook(String bookName, String isbn, int aisle, String author) {
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setBookName(bookName);
        addBookRequest.setIsbn(isbn);
        addBookRequest.setAisle(aisle);
        addBookRequest.setAuthorName(author);

        Response addBookResponse = given().log().all().header("Content-Type", "application/json").body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();
        System.out.println("Response:-  " + addBookResponse);
        return addBookResponse;
    }

    public Response getBookByID(String id){
        Response getBookByIDResponse = given().queryParam("ID",id).header("Content-Type","application/json")
                .when().get("Library/GetBook.php")
                .then().assertThat().statusCode(200).extract().response();

        System.out.println("response ++ ----" + getBookByIDResponse.asString());
        return getBookByIDResponse;
    }

    public DeleteBookRequest deleteBookByID(String id){
        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setID(id);

        Response delResponse = given().log().all().header("Content-Type","application/json").body(deleteBookRequest)
                .when().post("/Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        System.out.println("Response "+delResponse);
        return deleteBookRequest;
    }
    public GetBookByAuthorResponse[] getBookByAuthor(String author) {
        Response getBookAuthorResponse = given().queryParams("AuthorName", author)
                .header("Content-Type", "application/json")
                .when().get("/Library/GetBook.php")
                .then().statusCode(200).extract().response();

        GetBookByAuthorResponse[] getBookByAuthorResponses = getBookAuthorResponse.as(GetBookByAuthorResponse[].class);
        return getBookByAuthorResponses;
    }
}