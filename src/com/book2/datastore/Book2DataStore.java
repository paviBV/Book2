package com.book2.datastore;

import com.book2.entities.Book2;

import java.util.ArrayList;
import java.util.List;

public class Book2DataStore {

    List<Book2> bookMainList = new ArrayList<>();


    public void setBook2(String id, String name, int cost){
        Book2 bookMain = new Book2();
        bookMain.setbId(id);
        bookMain.setbName(name);
        bookMain.setbCost(cost);
        bookMainList.add(bookMain);

    }
    public void setBook2(){
        setBook2("B001","Miracle",400);
        setBook2("B002","Downning", 600);
        setBook2("B003","Raising Horizon",900);
    }
    public List<Book2> bookMainList(){
        return bookMainList;
    }
}
