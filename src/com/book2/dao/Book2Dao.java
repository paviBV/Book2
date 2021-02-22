package com.book2.dao;

import com.book2.datastore.Book2DataStore;
import com.book2.entities.Book2;

import java.util.List;

public class Book2Dao {
    Book2DataStore book2DataStore = new Book2DataStore();

    public void getBook2(){
        book2DataStore.setBook2();
    }
    public List<Book2> bookMainList(){
        return book2DataStore.bookMainList();
    }
}
