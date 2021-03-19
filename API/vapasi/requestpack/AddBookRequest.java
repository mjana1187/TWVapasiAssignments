package com.tw.vapasi.requestpack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddBookRequest {
    @JsonProperty("name")
    private String bookName;

    private String isbn;
    private int aisle;

    @JsonProperty("author")
    private String authorName;

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAisle() {
        return aisle;
    }
    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}



