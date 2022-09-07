package com.example.myapplication7;

import java.io.Serializable;

public class Books implements Serializable {
       private String bookName ;
       private String writerName ;
       private String Description;
       private int bookImg;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getBookImg() {
        return bookImg;
    }

    public void setBookImg(int bookImg) {
        this.bookImg = bookImg;
    }

    public Books(String bookName, String writerName, String description, int bookImg) {
        this.bookName = bookName;
        this.writerName = writerName;
        Description = description;
        this.bookImg = bookImg;
    }
}

