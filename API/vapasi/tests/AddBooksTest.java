package com.tw.vapasi.tests;

import com.tw.vapasi.responsepack.GetBookByAuthorResponse;
import com.tw.vapasi.responsepack.GetBookResponse;
import com.tw.vapasi.reusablemethods.ToCreateUniqueNumber;
import com.tw.vapasi.requestpack.AddBookRequest;
import com.tw.vapasi.responsepack.AddBookAndGetResponse;
import com.tw.vapasi.responsepack.AddBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddBooksTest extends AddGetDelBookMethods {
    ToCreateUniqueNumber toCreateUniqueNumber = new ToCreateUniqueNumber();

    @BeforeTest
    public void setURL(){
        RestAssured.baseURI = "http://216.10.245.166";
    }

    @DataProvider(name = "addBookAuthor")
    public static Object[][] addBookByAuthors() {
        return new Object[][]{{"Electronic Devices", "test01", "010111", "boxom"},
                {"Heaven is Having you", "Test02", "020222", "boxom"},
                {"Success", "test03", "0030333", "boxom"}};
    }

    @Test(dataProvider = "addBookAuthor")
    public void performAddBooks(String bookName,  String isbn, int aisle, String author ) {
        Response addBookAuthorResponse = addBook(bookName, isbn, aisle, author);
        AddBookResponse addBookResponse = addBookAuthorResponse.body().as(AddBookResponse.class);
        Assert.assertEquals(addBookResponse.getId(), isbn + aisle);
    }

    @DataProvider(name= "GetBookAuthor")
    public static Object [][] GetBooks(){
        return new Object [][] {{"boxom",3}};
    }

    @Test(dataProvider = "GetBookAuthor")
    public void getBooksByAuthor(String authorName, int totalNoOfBooks){

        GetBookByAuthorResponse[] GetBookAuthor = getBookByAuthor(authorName);
        Assert.assertEquals(GetBookAuthor.length, totalNoOfBooks);
        System.out.println("Books with 3 names are ");
        for (GetBookByAuthorResponse book : GetBookAuthor)
            System.out.println(book.getBookName());
    }
}
